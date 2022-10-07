package tests;

public class AllTests {
    public static void main(String[] args) {
        GameTest gameTest = new GameTest();
        gameTest.TestFirstPlayerIsWinnerIfFirstPlayerHasHigherResultThanSecondPlayer();
        gameTest.TestSecondPlayerIsWinnerIfSecondPlayerHasHigherResultThanFirstPlayer();
        gameTest.TestItIsDrawIfPlayersHaveSameResults();
        gameTest.TestResultIsMoreThanZeroAndLessThirteen();
    }
}
