package NestedLoopsLab;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine()); // 1
        int end = Integer.parseInt(scanner.nextLine()); // 10
        int magicNum = Integer.parseInt(scanner.nextLine()); // 5

        int counter = 0;
        boolean isValid = false;
        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                counter++;

                int sum = i + j;

                if (i >= end && j >= end) {
                    if (sum != magicNum) {
                        System.out.printf("%d combinations - neither equals %d", counter, magicNum);
                        break;
                    }
                }
                if (sum == magicNum) {
                    isValid = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)", counter, i, j, sum);
                    break;
                }
            }
            if (isValid) {
                break;
            }
        }
    }
}
