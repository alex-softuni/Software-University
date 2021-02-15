import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

public class MergeTwoFiles {
    private static final String INPUT_ONE = "inputOne.txt";
    private static final String INPUT_TWO = "inputTwo.txt";
    private static final String OUTPUT = "output.txt";

    public static void main(String[] args) throws IOException {
        BufferedReader firstInputReader = new BufferedReader(new FileReader(INPUT_ONE));
        BufferedReader secondInputReader = new BufferedReader(new FileReader(INPUT_TWO));

        PrintWriter writer = new PrintWriter(OUTPUT);

        String line = firstInputReader.readLine();
        while (line != null) {
            writer.println(line);
            line = firstInputReader.readLine();
        }
        line = secondInputReader.readLine();

        while (line != null) {
            writer.println(line);
            line = secondInputReader.readLine();
        }

        writer.close();


    }
}
