package NestedLoopsExercises;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        for (int i = firstNumber; i <= secondNumber; i++) {
            String numberAsString = "" + i;
            int evenSum = 0;
            int oddSum = 0;

            for (int j = 0; j < 6; j++) {
                int digit = Integer.parseInt("" + numberAsString.charAt(j));
                if (j % 2 == 0) {
                    evenSum += digit;
                } else {
                    oddSum += digit;
                }
            }
            if (oddSum == evenSum) {
                System.out.print(" " + numberAsString);
            }
        }

    }
}


