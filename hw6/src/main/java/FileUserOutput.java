import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileUserOutput implements UserOutput {
    public FileUserOutput() {
    }

    @Override
    public void print(String outputText) {
        try(FileWriter writer = new FileWriter("questions.txt", true)) {
            writer.write(outputText);
            writer.append('\n');
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
