public class TestBlock {
    private TestElement[] testElements;
    private int rightAnswersCount = 0;
    private int wrongAnswersCount = 0;
    private UserInput userInput = new ConsoleUserInput();
    private UserOutput userOutput = new ConsoleUserOutput();

    public TestBlock(TestElement[] testElements) {
        this.testElements = testElements;
    }

    public void pass() throws AnswerIndexOutOfBoundsException {
        for (TestElement testElement : testElements) {
            if (testElement.askAndCheckAnswerCorrectOrWrong()) {
                rightAnswersCount++;
            } else {
                wrongAnswersCount++;
            }
        }
        showCountOfCorrectAnswers();

        showCountOfWrongAnswers();
    }

    public void showCountOfCorrectAnswers() {
        userOutput.print("Number of correct answers:" + rightAnswersCount);
    }

    public void showCountOfWrongAnswers() {
        userOutput.print("Number of wrong answers:" + wrongAnswersCount + "\n");
    }
}
