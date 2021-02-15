package Lab;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oddNumbers = Integer.parseInt(scanner.nextLine());
        int printedNumbers = 0;
        int number = 0;
        int sum = 0;
        while (oddNumbers > printedNumbers) {
            number++;
            if (number % 2 == 1) {
                System.out.println(number);
                sum += number;
                printedNumbers++;
            }
        }
        System.out.println("Sum:" + " " + sum);
    }
}
