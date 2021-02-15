package MethodsLab;

import java.util.Scanner;

public class E11MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int b = Integer.parseInt(scanner.nextLine());

        System.out.println(Math.round(calculate(a,operator,b)));
    }

    public static double calculate(int a, String operator, int b) {
        double result = 0.0;

        switch (operator) {
            case "/":
                result = a / b;
                break;
            case "*":
                result = a * b;
                break;
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
        }

        return result;
    }
}
