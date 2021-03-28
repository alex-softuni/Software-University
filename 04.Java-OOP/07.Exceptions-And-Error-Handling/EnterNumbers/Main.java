package EnterNumbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                int start = Integer.parseInt(scanner.nextLine());
                int end = Integer.parseInt(scanner.nextLine());
                if (start < 0 || start > 100 || end < 0 || end > 100) {
                    throw new IllegalArgumentException();
                }
                printNumbers(start, end);

            } catch (NumberFormatException ex) {
                System.out.println("Number must be a digit");
            } catch (IllegalArgumentException ex) {
                System.out.println("Number must be positive in the range of [0-100]");
            }
        }
    }

    private static void printNumbers(int start, int end) {
        for (int i = start; i < end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
