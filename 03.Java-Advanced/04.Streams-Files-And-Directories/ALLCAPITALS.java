import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ALLCAPITALS {
    private static final String PATH = "input.txt";
    private static final String OUTPUT = "output.txt";

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(PATH));
        PrintWriter writer = new PrintWriter(OUTPUT);


        String line = reader.readLine();
        while (line != null) {
            writer.println(line.toUpperCase());
            line = reader.readLine();
        }
        writer.close();
    }
}
