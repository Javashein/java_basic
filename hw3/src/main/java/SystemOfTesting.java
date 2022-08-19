import java.util.Scanner;

public class SystemOfTesting {
    public static void main(String[] args) {
        int correctAnswersCount = 0;
        int wrongAnswersCount = 0;

        Answer[] answersForFirstQuestion = {new Answer("1. System.out.println(\"Hello World\");", true),
                new Answer("2. echo(\"Hello World\");", false),
                new Answer("3. print (\"Hello World\");", false),
        };

        Answer[] answersForSecondQuestion = {new Answer("1.string", false),
                new Answer("2.String", true),
                new Answer("3.text", false),
                new Answer("4.Text", false),
        };

        Answer[] answersForThirdQuestion = {new Answer("1.package", false),
                new Answer("2.getlib", false),
                new Answer("3.setlib", false),
                new Answer("4.import", true),
                new Answer("5.lib", false),
        };

        Question[] questions = {new Question("What is a correct syntax to output \"Hello World\" in Java", answersForFirstQuestion),
                new Question("Which data type is used to create a variable that should store text?", answersForSecondQuestion),
                new Question("Which keyword is used to import a package from the Java API library?", answersForThirdQuestion)};

        Scanner sc = new Scanner(System.in);

        for (Question question : questions) {
            System.out.println(question.getQuestion());

            for (Answer answer : question.getAnswers()) {
                System.out.println(answer.getAnswer());
            }
            System.out.println("Enter number of correct answer:");
            int answer = sc.nextInt();

            if (answer == question.getNumberOfCorrectAnswer(question.getAnswers())) {
                correctAnswersCount++;
                System.out.println("You are right!\n");
            } else {
                wrongAnswersCount++;
                System.out.println("You are wrong!\n");
            }
        }
        System.out.println("Number of correct answers:" + correctAnswersCount);
        System.out.println("Number of wrong answers:" + wrongAnswersCount);
    }
}
