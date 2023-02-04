package tests;

import app.*;
import assertions.Assertions;
import tests.mocks.DiceMock;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GameTest {

    public void TestFirstPlayerIsWinnerIfFirstPlayerHasHigherResultThanSecondPlayer() {
        String scenario = "Тест на то, что если у первого игрока результат больше, чем у второго, то победителем является первый";
        try {
            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            PrintStream originalOut = System.out;
            System.setOut(new PrintStream(outContent));
            Player firstPlayer = new Player("first");
            Player secondPlayer = new Player("second");
            String expectedWinnerPrinter = "Победитель: " + firstPlayer.getName();
            GameWinnerPrinter winnerPrinter = new GameWinnerConsolePrinter();
            Dice dice = new DiceMock(DiceMock.RollDiceOfFirstPlayer.MORE);
            Game game = new Game(dice, winnerPrinter);
            game.playGame(firstPlayer, secondPlayer);
            String actual = outContent.toString();
            System.setOut(originalOut);
            Assertions.assertEquals(expectedWinnerPrinter + System.getProperty("line.separator"), actual);
            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

    public void TestSecondPlayerIsWinnerIfSecondPlayerHasHigherResultThanFirstPlayer() {
        String scenario = "Тест на то, что если у втоого игрока результат больше, чем у первого, то победителем является второй";
        try {
            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            PrintStream originalOut = System.out;
            System.setOut(new PrintStream(outContent));
            Player firstPlayer = new Player("first");
            Player secondPlayer = new Player("second");
            String expectedWinnerPrinter = "Победитель: " + secondPlayer.getName();
            GameWinnerPrinter winnerPrinter = new GameWinnerConsolePrinter();
            Dice dice = new DiceMock(DiceMock.RollDiceOfFirstPlayer.LESS);
            Game game = new Game(dice, winnerPrinter);
            game.playGame(firstPlayer, secondPlayer);
            String actual = outContent.toString();
            System.setOut(originalOut);
            Assertions.assertEquals(expectedWinnerPrinter + System.getProperty("line.separator"), actual);
            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

    public void TestItIsDrawIfPlayersHaveSameResults() {
        String scenario = "Тест на то, если у игроков одинаковые результаты, то объявляется ничья";
        try {
            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            PrintStream originalOut = System.out;
            System.setOut(new PrintStream(outContent));
            Player firstPlayer = new Player("first");
            Player secondPlayer = new Player("second");
            String expectedWinnerPrinter = "Победитель: " + null;
            GameWinnerPrinter winnerPrinter = new GameWinnerConsolePrinter();
            Dice dice = new DiceMock();
            Game game = new Game(dice, winnerPrinter);
            game.playGame(firstPlayer, secondPlayer);
            String actual = outContent.toString();
            System.setOut(originalOut);
            Assertions.assertEquals(expectedWinnerPrinter + System.getProperty("line.separator"), actual);
            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

    public void TestResultIsMoreThanZeroAndLessThirteen() {
        String scenario = "Тест на то, результат игрока больше 0 и меньше 13";
        try {
            Dice dice = new DiceImpl();
            int result = dice.roll();
            Assertions.assertTrue((result > 0) && (result < 13));
            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }


}
