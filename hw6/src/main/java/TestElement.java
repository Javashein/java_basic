public class TestElement {
    private final String question;
    private final String[] answers;
    private final int rightAnswerIndex;
    private UserOutput userOutput;
    private final UserInput userInput = new ConsoleUserInput();

    public TestElement(String question, String[] answers, int rightAnswerIndex, UserOutput userOutput) {
        this.question = question;
        this.answers = answers;
        this.rightAnswerIndex = rightAnswerIndex;
        this.userOutput = userOutput;
    }

    public void show() {
        userOutput.print(question);
        for (String answerText : answers) {
            userOutput.print(answerText);
        }
    }

    public boolean askAndCheckAnswerCorrectOrWrong() throws AnswerIndexOutOfBoundsException {
        show();
        int userAnswer = 0;
        userAnswer = userInput.readInt(0, answers.length);
        return checkAnswerCorrectOrWrong(userAnswer);
    }

    private boolean checkAnswerCorrectOrWrong(int numberOfAnswer) {
        if (rightAnswerIndex == numberOfAnswer) {
            userOutput.print("You are right!\n");
            return true;
        } else {
            userOutput.print("You are wrong!\n");
            return false;
        }
    }
}
