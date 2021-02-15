package ArraysLab;

import java.util.Scanner;

public class E05EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] numbersAsStrings = line.split(" ");

        int evenSum = 0;
        int oddSum = 0;
        int[] numbers = new int[numbersAsStrings.length];
        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = Integer.parseInt(numbersAsStrings[i]);
            if (numbers[i] % 2 == 0){
                evenSum += numbers[i];
            } else {
                oddSum += numbers[i];
            }
        }
        System.out.println(evenSum - oddSum);

    }

}
