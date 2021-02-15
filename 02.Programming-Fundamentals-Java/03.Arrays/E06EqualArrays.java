package ArraysLab;

import java.util.Scanner;

public class E06EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstNumbers = scanner.nextLine();
        String[] firstNumberStrings = firstNumbers.split(" ");

        int sum = 0;

        int[] firstArray = new int[firstNumberStrings.length];
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = Integer.parseInt(firstNumberStrings[i]);
            sum += firstArray[i];
        }

        String secondNumbers = scanner.nextLine();
        String[] secondNumbersString = secondNumbers.split(" ");
        int[] secondArray = new int[firstNumberStrings.length];
        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = Integer.parseInt(secondNumbersString[i]);
        }
        boolean areEqual = true;
        int differentAtIndex = -1;
        if (firstArray.length == secondArray.length) {
            for (int i = 0; i < firstArray.length; i++) {
                if (firstArray[i] != secondArray[i]) {
                    areEqual = false;
                    differentAtIndex = i;
                    break;
                } else {
                    areEqual = true;

                }
            }
        }
        if (areEqual) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.", differentAtIndex);
        }

    }
}
