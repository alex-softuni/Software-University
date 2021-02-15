package com.company;

import java.util.Scanner;

public class EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String size = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        double price = 0;
        switch (fruit) {
            case "Watermelon":
                if (size.equals("small")) {
                    price = (56.00 * 2) * quantity;
                } else if (size.equals("big")) {
                    price = (28.70 * 5) * quantity;
                }
                break;
            case "Mango":
                if (size.equals("small")) {
                    price = (36.66 * 2) * quantity;
                } else if (size.equals("big")) {
                    price = (19.60 * 5) * quantity;
                }
                break;
            case "Pineapple":
                if (size.equals("small")) {
                    price = (42.10 * 2) * quantity;
                } else if (size.equals("big")) {
                    price = (24.80 * 5) * quantity;
                }
                break;
            case "Raspberry":
                if (size.equals("small")) {
                    price = (20.00 * 2) * quantity;
                } else if (size.equals("big")) {
                    price = (15.20 * 5) * quantity;
                }
                break;

        }
        if (price >= 400 && price <= 1000) {
            price *= 0.85;
        } else if (price > 1000) {
            price *= 0.50;
        }
        System.out.printf("%.2f lv.",price);
    }
}
