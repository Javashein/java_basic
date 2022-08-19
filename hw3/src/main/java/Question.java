public class Question {
    private String question;
    private Answer[] answers;

    public Question(String question, Answer[] answers) {
        this.question = question;
        this.answers = answers;
    }

    public String getQuestion() {
        return question;
    }

    public Answer[] getAnswers() {
        return answers;
    }

    public int getNumberOfCorrectAnswer(Answer[] answers) {
        for (int i = 0; i < answers.length; i++) {
            if (answers[i].isCorrect()) {
                return i + 1;
            }
        }
        return 0;
    }
}
