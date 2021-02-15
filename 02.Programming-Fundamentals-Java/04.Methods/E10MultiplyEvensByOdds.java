package MethodsLab;

import java.util.Scanner;

public class E10MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Math.abs(Integer.parseInt(scanner.nextLine()));

        System.out.println(getMultipleOfEvensAndOdds(n));
    }

    public static int getMultipleOfEvensAndOdds(int n) {
        int evensSum = findEvenDigitSum(n);
        int odsSum = findOddDigitSum(n);

        return evensSum * odsSum;
    }

    public static int findEvenDigitSum(int n) {

        int lastDigit = 0;
        int evenDigitSum = 0;

        while (n != 0) {
            lastDigit = n % 10;

            if (lastDigit % 2 == 0) {

                evenDigitSum += lastDigit;
            }
            n = n / 10;
        }

        return evenDigitSum;
    }

    public static int findOddDigitSum(int n) {
        int lastDigit = 0;
        int oddDigitSum = 0;

        while (n != 0) {
            lastDigit = n % 10;

            if (lastDigit % 2 == 1) {

                oddDigitSum += lastDigit;
            }
            n = n / 10;
        }
        return oddDigitSum;
    }
}

