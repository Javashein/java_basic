import java.util.Scanner;

public class TestingSystem {
    public static void main(String[] args) {
        int correctAnswersCount = 0;
        int wrongAnswersCount = 0;

        String[] questions = {"What is a correct syntax to output \"Hello World\" in Java", "Which data type is used to create a variable that should store text?", "Which keyword is used to import a package from the Java API library?"};
        int[] rightAnswerIndexes = {1, 2, 4};
        String[][] answers = {{"1. System.out.println(\"Hello World\");", "2. echo(\"Hello World\");", "3. print (\"Hello World\");"},
                {"1.string", "2.String", "3.text", "4.Text"},
                {"1.package", "2.getlib", "3.setlib", "4.import", "5.lib"}};

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            int countOfAnswersInQuestion = answers[i].length;
            for (int j = 0; j < countOfAnswersInQuestion; j++) {
                System.out.println(answers[i][j]);
            }
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number of correct answer:");
            int numberOfAnswer = 0;
            while (sc.hasNext()) {
                if (sc.hasNextInt()) {
                    numberOfAnswer = sc.nextInt();
                    if ((numberOfAnswer > 0) && (numberOfAnswer < countOfAnswersInQuestion)) {
                        break;
                    } else {
                        System.out.println("Number is out of range!");
                    }
                } else {
                    System.out.println("It is not a number!");
                }
                System.out.println("Enter number of correct answer:");
                sc.next();
            }
            if (numberOfAnswer == rightAnswerIndexes[i]) {
                correctAnswersCount++;
                System.out.println("You are right!\n");
            } else {
                wrongAnswersCount++;
                System.out.println("You are wrong!\n");
            }
            System.out.println("Number of correct answers:" + correctAnswersCount);
            System.out.println("Number of wrong answers:" + wrongAnswersCount + "\n");
        }
    }
}