package Lab;

import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int count = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        boolean isValid = false;
        while (count < 11) {
            isValid = true;
            sum = number * count;
            System.out.println(number + " " + "X" + " " + count + " " + "=" + " " + sum);
            count++;
        }
        if (!isValid) {
            System.out.printf("%d X %d = %d", number, count, number * count);
        }
    }
}