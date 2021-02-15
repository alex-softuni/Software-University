import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SumLines {
    private static final String PATH = "input.txt";

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(PATH));

        String line = reader.readLine();

        while (line != null) {
            int sum = 0;
            for (int i = 0; i < line.length(); i++) {
                char symbol = line.charAt(i);
                sum += symbol;
            }

            System.out.println(sum);
            line = reader.readLine();
        }
    }
}
