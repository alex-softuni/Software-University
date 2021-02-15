import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SumBytes {
    private static final String PATH = "input.txt";

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(PATH));

        String line = reader.readLine();

        int sum = 0;
        while (line != null) {
            for (int i = 0; i < line.length(); i++) {
                char symbol = line.charAt(i);
                sum += symbol;
            }

            line = reader.readLine();
        }
        System.out.println(sum);
    }
}
