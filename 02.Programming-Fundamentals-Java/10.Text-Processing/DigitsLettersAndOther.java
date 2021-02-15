import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        char[] ch = str.toCharArray();
        List<Character> digits = new ArrayList<>();
        List<Character> letters = new ArrayList<>();
        List<Character> other = new ArrayList<>();

        for (int i = 0; i < ch.length; i++) {
            char symbol = ch[i];
            if (Character.isLetter(symbol)) {
                letters.add(symbol);
            } else if (Character.isDigit(symbol)) {
                digits.add(symbol);
            } else {
                other.add(symbol);
            }
        }
        for (Character digit : digits) {
            System.out.print(digit);
        }
        System.out.println();
        for (Character letter : letters) {
            System.out.printf("%c",letter);
        }
        System.out.println();
        for (Character others : other) {
            System.out.printf("%c",others);
        }

    }
}
