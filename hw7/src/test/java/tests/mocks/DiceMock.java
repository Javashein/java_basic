package tests.mocks;

import app.Dice;

public class DiceMock implements Dice  {
    int testDiceResult = 6;
    public RollDiceOfFirstPlayer r;

    public enum RollDiceOfFirstPlayer{
        MORE,
        LESS
    }

    public DiceMock(RollDiceOfFirstPlayer r) {
        this.r = r;
    }

    public DiceMock() {
    }

    public int nextInt(){
        int nextResult = testDiceResult;
        switch (r) {
            case LESS:
                nextResult = testDiceResult++;
                break;
            case MORE:
                nextResult = testDiceResult--;
                break;
        }

        return nextResult;
    }

    @Override
    public int roll() {
        return nextInt();
    }
}
