import java.io.*;

public class WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {
        BufferedReader in =
                new BufferedReader(new FileReader("input.txt"));
        PrintWriter out =
                new PrintWriter(new FileWriter("output.txt"));

        int counter = 1;
        String line = in.readLine();
        while (line != null) {
            if (counter % 3 == 0) {
                out.println(line);

            }
            counter++;
            line = in.readLine();
        }
        out.close();
    }
}
