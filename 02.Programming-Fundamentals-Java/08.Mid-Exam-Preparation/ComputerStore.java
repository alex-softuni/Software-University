package com.company;

import java.util.Scanner;

public class ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalSum = 0;
        double totalTaxes = 0;

        boolean isSpecial = false;

        String input = scanner.nextLine();
        if (input.equals("special")) {
            isSpecial = true;
        }
        while (!input.equals("special") && !input.equals("regular")) {
            double price = Double.parseDouble(input);
            if (price <= 0) {
                System.out.println("Invalid price!");
            } else {
                totalTaxes += price * 0.2;
                totalSum += price * 1.20;
            }
            input = scanner.nextLine();

            if (input.equals("special")) {
                isSpecial = true;
                break;
            }

        }
        if (totalSum <= 0) {
            System.out.println("Invalid order!");
            return;
        }
        double priceWithoutTaxes = totalSum - totalTaxes;
        if (isSpecial) {
            totalSum *= 0.90;
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", priceWithoutTaxes);
            System.out.printf("Taxes: %.2f$%n", totalTaxes);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$", totalSum);
        } else {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", priceWithoutTaxes);
            System.out.printf("Taxes: %.2f$%n", totalTaxes);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$", totalSum);
        }
    }
}
