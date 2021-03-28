package SquareRoot;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int number = Integer.parseInt(scanner.nextLine());
            System.out.println(Math.sqrt(number));

        } catch (NumberFormatException e) {
            throw new NumberFormatException("Invalid Number");
        } finally {
            System.out.println("Good bye");
        }
    }
}
