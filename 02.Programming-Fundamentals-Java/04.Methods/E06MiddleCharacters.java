import java.util.Arrays;
import java.util.Scanner;

public class E06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        printMiddleCharacter(input);
    }
static  void printMiddleCharacter(String input) {
        int length;
        int middle;
    //odd
    if (input.length() % 2 == 1) {
     length = input.length();
     middle = length / 2;
    System.out.println(input.charAt(middle));
} else {
        length = input.length();
        middle = length / 2;
        System.out.println(input.charAt(middle - 1) + "" + input.charAt(middle));
    }

    }






}
