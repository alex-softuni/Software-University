import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int i = 0;
        for (char c : input.toCharArray()) {
           i = (c + 3);
            System.out.print((char) i);
        }
    }
}
