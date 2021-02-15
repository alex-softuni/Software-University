import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class LineNumbers {
    private static final String INPUT_PATH = "Exercises Resources/inputLineNumbers.txt";
    private static final String OUTPUT_PATH = "output.txt";

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(INPUT_PATH));
        PrintWriter writer = new PrintWriter(OUTPUT_PATH);
        int count = 1;
        String line = reader.readLine();
        while (line != null) {
            writer.printf("%d. %s%n", count++, line);
            line = reader.readLine();
        }
        writer.close();

    }
}
