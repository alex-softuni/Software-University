package com.company;

import java.util.Scanner;

public class SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double capacity = Double.parseDouble(scanner.nextLine());
        int countBaggage = 0;

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            double volumeTrunk = Double.parseDouble(input);

            if ((countBaggage + 1) % 3 == 0) {
                volumeTrunk *= 1.10;
            }
            if (volumeTrunk > capacity) {
                break;
            }
            countBaggage++;
            capacity -= volumeTrunk;
            input = scanner.nextLine();
        }
        if (input.equals("End")) {
            System.out.println("Congratulations! All suitcases are loaded!");
        } else {
            System.out.println("No more space!");
        }
        System.out.printf("Statistic: %d suitcases loaded.", countBaggage);
    }
}