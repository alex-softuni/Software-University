import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExtractIntegers {
    public static void main(String[] args) throws IOException {
        Scanner scanner =
                new Scanner(new FileInputStream("input.txt"));

        PrintWriter out =
                new PrintWriter(new FileOutputStream("output.txt"));

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                out.println(scanner.nextInt());
            }
            scanner.next();
        }
        out.close();
    }
}
