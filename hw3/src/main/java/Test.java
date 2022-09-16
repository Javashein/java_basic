public class Test {
    private TestElement[] testElements;
    private int rightAnswersCount = 0;
    private int wrongAnswersCount = 0;
    private UserInput userInput = new ConsoleUserInput();
    private UserOutput userOutput = new ConsoleUserOutput();

    public Test(TestElement[] testElements) {
        this.testElements = testElements;
    }

    public void pass() {
        for (TestElement testElement : testElements) {
            if (testElement.ask()) {
                rightAnswersCount++;
            } else {
                wrongAnswersCount++;
            }
        }
        showCountOfCorrectAnswers();

        showCountOfWrongAnswers();
    }

    public void showCountOfCorrectAnswers() {
        System.out.println("Number of correct answers:" + rightAnswersCount);
    }

    public void showCountOfWrongAnswers() {
        System.out.println("Number of wrong answers:" + wrongAnswersCount + "\n");
    }
}
