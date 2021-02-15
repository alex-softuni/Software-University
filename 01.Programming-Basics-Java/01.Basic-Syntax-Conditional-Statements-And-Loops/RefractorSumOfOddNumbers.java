package Lab;

import java.util.Scanner;

public class RefractorSumOfOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        int printedNumbers = 0;
        for (int i = 1; printedNumbers < n; i++) {
            if (i % 2 == 1 || i == 1){
                System.out.println(i);
                sum += i;
                printedNumbers++;
            }
        }
        System.out.printf("Sum: %d%n", sum);

    }
}
