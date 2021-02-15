package Lab;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        int count = 0;
        int sum = 0;
        while (count < 10) {
            count++;
            sum = number * count;
            System.out.println(number + " " + "X" + " " + count + " " + "=" + " " + sum);


        }
    }
}
