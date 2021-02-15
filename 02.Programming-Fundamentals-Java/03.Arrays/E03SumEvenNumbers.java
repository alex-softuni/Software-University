package ArraysLab;

import java.util.Scanner;

public class E03SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String arrayAsString = scanner.nextLine();
        String[] numbersAsStrings = arrayAsString.split(" ");

        int[] arr = new int[numbersAsStrings.length];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(numbersAsStrings[i]);
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}
