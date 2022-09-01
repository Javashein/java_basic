import java.util.Scanner;

public class ConsoleUserInput implements UserInput {
    private Scanner sc;
    public ConsoleUserInput() {
        this.sc = new Scanner(System.in);
    }

    @Override
    public String readString() {
        return sc.next();
    }

    @Override
    public int readInt() {
        return sc.nextInt();
    }

    @Override
    public boolean isReadString() {
        return sc.hasNext();
    }

    @Override
    public boolean isReadInt() {
        return sc.hasNextInt();
    }
}
