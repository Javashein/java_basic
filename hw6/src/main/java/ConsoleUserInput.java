import java.util.Scanner;

public class ConsoleUserInput implements UserInput {
    private Scanner sc;
    private final UserOutput userOutput = new ConsoleUserOutput();

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
    public int readInt(int minValue, int maxValue) {
        int enteredNumberOfAnswer;
        boolean shouldNextAnswerBeAsked = true;
        do {
            userOutput.print("Enter number of correct answer:");
            while (!isReadInt()) {
                readString();
                userOutput.print("It is not a number!");
            }
            enteredNumberOfAnswer = readInt();
            if (enteredNumberOfAnswer > minValue && enteredNumberOfAnswer <= maxValue) {
                shouldNextAnswerBeAsked = false;
            } else {
                try {
                    throw new AnswerIndexOutOfBoundsException("Enter a number greater than 0 and less than or equal " + maxValue);
                }
               catch (AnswerIndexOutOfBoundsException exception) {
                    userOutput.print(exception.getMessage());
               }
            }
        } while (shouldNextAnswerBeAsked);
        return enteredNumberOfAnswer;
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
