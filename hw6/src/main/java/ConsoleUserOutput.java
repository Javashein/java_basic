public class ConsoleUserOutput implements UserOutput {
    @Override
    public void print(String outputText) {
        System.out.println(outputText);
    }
}
