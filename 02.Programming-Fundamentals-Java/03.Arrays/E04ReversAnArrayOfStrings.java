package ArraysLab;

import java.util.Scanner;

public class E04ReversAnArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       String[] arrayAsString = scanner.nextLine().split(" ");

        for (int i = arrayAsString.length - 1; i >= 0 ; i--) {
            System.out.print(arrayAsString[i] + " ");
        }
    }
}
