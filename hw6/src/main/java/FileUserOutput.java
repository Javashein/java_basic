import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileUserOutput implements UserOutput {

    public FileUserOutput(String fileName) {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNext()) {
                print(scanner.nextLine());
            }
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }

    }

    @Override
    public void print(String outputText) {

    }
}
