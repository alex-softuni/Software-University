package Exercises;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        double result = 0;
        String type = "";

        switch (operator) {
            case "+":
                result = n1 + n2;
                if (result % 2 == 0) {
                    type = "even";
                } else {
                    type = "odd";
                }
                System.out.printf("%d + %d = %.0f - %s ", n1, n2, result, type);
                break;
            case "-":
                result = n1 - n2;
                if (result % 2 == 0) {
                    type = "even";
                } else {
                    type = "odd";
                }
                System.out.printf("%d - %d = %.0f - %s ", n1, n2, result, type);
                break;
            case "*":
                result = n1 * n2;
                if (result % 2 == 0) {
                    type = "even";
                } else {
                    type = "odd";
                }
                System.out.printf("%d * %d = %.0f - %s", n1, n2, result,type);
                break;
            case "/":
                if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);
                } else if (n2 != 0) {
                    result = n1 * 1.0 / n2;
                    System.out.printf("%d / %d = %.2f", n1, n2, result);
                }

                break;
            case "%":
                if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);
                } else {
                    result = n1 % n2;
                    System.out.printf("%d %% %d = %.0f", n1, n2, result);
                }
                break;
        }
    }
}
