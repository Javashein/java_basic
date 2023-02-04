package output;

public class ConsoleUserOutput implements IUserOutput {
    @Override
    public void print(String outputText) {
        System.out.println(outputText);
    }
}
