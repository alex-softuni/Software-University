import java.io.*;

public class CopyBytes {
    public static void main(String[] args) throws IOException {

        InputStream in = new FileInputStream("input.txt");
        OutputStream out = new FileOutputStream("output.txt");

        int oneByte = 0;
        while ((oneByte = in.read()) >= 0) {
            if (oneByte == 10 || oneByte == 32) {
                out.write(oneByte);
            } else {
                String digits = String.valueOf(oneByte);
                for (int i = 0; i < digits.length(); i++) {
                    out.write(digits.charAt(i));
                }
            }

        }
    }
}
