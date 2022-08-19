import java.util.Scanner;

public class TestingSystem {
    public static void main(String[] args) {
        int correctAnswersCount = 0;
        int wrongAnswersCount = 0;
        String[][][] answers = {{{"What is a correct syntax to output \"Hello World\" in Java"}, {"1. System.out.println(\"Hello World\");", "2. echo(\"Hello World\");", "3. print (\"Hello World\");"}, {"1"}},
                {{"Which data type is used to create a variable that should store text?"}, {"1.string", "2.String", "3.text", "4.Text"}, {"2"}},
                {{"Which keyword is used to import a package from the Java API library?"}, {"1.package", "2.getlib", "3.setlib", "4.import", "5.lib"}, {"4"}}};

        for (int i = 0; i < answers.length; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println(answers[i][0][0]);
            for (int j = 0; j < answers[i][1].length; j++) {
                System.out.println(answers[i][1][j]);
            }
            System.out.println("Enter number of correct answer:");
            int answer = sc.nextInt();
            if (answer == Integer.parseInt(answers[i][2][0])) {
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