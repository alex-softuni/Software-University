import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WriteFile {
    public static void main(String[] args) throws IOException {
        String input = "input.txt";
        String output = "output.txt";

        List<Character> symbols = new ArrayList<>();
        Collections.addAll(symbols, '.', ',', '!', '?');

        InputStream in = new FileInputStream(input);
        OutputStream out = new FileOutputStream(output);

        int oneByte = 0;
        while ((oneByte = in.read()) >= 0) {
            if (!symbols.contains((char) oneByte)) {
                out.write(oneByte);
            }
        }

    }
}
