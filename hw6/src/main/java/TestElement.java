public class TestElement {
    private final String question;
    private final String[] answers;
    private final int rightAnswerIndex;
    private final UserOutput userOutput = new ConsoleUserOutput();
    private final UserInput userInput = new ConsoleUserInput();

    public TestElement(String question, String[] answers, int rightAnswerIndex) {
        this.question = question;
        this.answers = answers;
        this.rightAnswerIndex = rightAnswerIndex;
    }

    public void show() {
        userOutput.print(question);
        for (String answerText : answers) {
            userOutput.print(answerText);
        }
    }

    public boolean askAndCheckAnswerCorrectOrWrong() {
        show();
        int userAnswer = 0;
        try {
            userAnswer = userInput.readInt(0, answers.length);

        }
       catch (AnswerIndexOutOfBoundsException exception)  {
            exception.getMessage();
       }
        finally {
            return checkAnswerCorrectOrWrong(userAnswer);
        }
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
