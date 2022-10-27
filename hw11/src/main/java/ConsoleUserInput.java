import java.util.Scanner;

public class ConsoleUserInput implements UserInput {
    private Scanner sc;


    public ConsoleUserInput() {
        this.sc = new Scanner(System.in);
    }

    @Override
    public String readString() {
        return null;
    }

    @Override
    public int readInt() {
        return 0;
    }

    @Override
    public boolean isReadString() {
        return false;
    }

    @Override
    public boolean isReadInt() {
        return false;
    }
}
