public class TestElement {
    private String question;
    private String[] answers;
    private int rightAnswerIndex;
    private UserOutput userOutput = new ConsoleUserOutput();

    public TestElement(String question, String[] answers, int rightAnswerIndex) {
        this.question = question;
        this.answers = answers;
        this.rightAnswerIndex = rightAnswerIndex;
    }

    public void show() {
        userOutput.print(getQuestion());
        for (String answerText : answers) {
            userOutput.print(answerText);
        }
    }

    public String getQuestion() {
        return question;
    }

    public String[] getAnswers() {
        return answers;
    }

    public int getRightAnswerIndex() {
        return rightAnswerIndex;
    }
}
