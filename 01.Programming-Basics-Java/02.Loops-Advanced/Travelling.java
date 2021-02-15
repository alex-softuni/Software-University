package NestedLoopsLab;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String destination = "";


        while (!input.equals("End")) {

            destination = input;
            double minBudget = Double.parseDouble(scanner.nextLine());
            double sum = 0;
            while (true) {
                if (sum >= minBudget) {
                    System.out.printf("Going to %s!%n",destination);
                    break;
                }

                double currentValue = Double.parseDouble(scanner.nextLine());

                sum = sum + currentValue;
            }


            input = scanner.nextLine();
        }
    }
}
