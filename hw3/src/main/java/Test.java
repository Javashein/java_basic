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
            testElement.show();
            int enteredNumberOfAnswer;
            int countAnswersInQuestion;
            boolean shouldNextAnswerBeAsked;
            do {
                shouldNextAnswerBeAsked = true;
                userOutput.print("Enter number of correct answer:");
                while (!userInput.isReadInt()) {
                    userInput.readString();
                    userOutput.print("It is not a number!");
                }
                enteredNumberOfAnswer = userInput.readInt();
                countAnswersInQuestion = getCountAnswersInQuestion(testElement);

                if (enteredNumberOfAnswer > 0 && enteredNumberOfAnswer <= countAnswersInQuestion) {
                    checkAnswerCorrectOrWrong(testElement, enteredNumberOfAnswer);
                    shouldNextAnswerBeAsked = false;
                } else {
                    userOutput.print("Enter a number greater than 0 and less than or equal" + countAnswersInQuestion);
                }
            } while (shouldNextAnswerBeAsked);
        }
        showCountOfCorrectAnswers();
        showCountOfWrongAnswers();
    }

    public int getCountAnswersInQuestion(TestElement testElement) {
        return testElement.getAnswers().length;
    }

    public boolean checkAnswerCorrectOrWrong(TestElement testElement, int numberOfAnswer) {
        if (testElement.getRightAnswerIndex() == numberOfAnswer) {
            rightAnswersCount++;
            userOutput.print("You are right!\n");
            return true;
        } else {
            wrongAnswersCount++;
            userOutput.print("You are wrong!\n");
            return false;
        }
    }

    public void showCountOfCorrectAnswers() {
        System.out.println("Number of correct answers:" + rightAnswersCount);
    }

    public void showCountOfWrongAnswers() {
        System.out.println("Number of wrong answers:" + wrongAnswersCount + "\n");
    }
}
