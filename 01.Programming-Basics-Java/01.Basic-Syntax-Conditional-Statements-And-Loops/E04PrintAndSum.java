package Exercises;

import java.util.Scanner;

public class E04PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        int counter = 0;

        for (int i = firstNumber; i <= secondNumber; i++) {
            System.out.print(i + " ");
            counter += i;
        }
        System.out.printf("%nSum: %d",counter);
    }
}
