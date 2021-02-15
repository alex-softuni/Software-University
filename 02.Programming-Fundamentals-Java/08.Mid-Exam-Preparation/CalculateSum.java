package com.company;

import java.sql.SQLOutput;
import java.util.*;

public class CalculateSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\|");
        double profit = 0;
        double budget = Double.parseDouble(scanner.nextLine());
        List<Double> soldItems = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            String[] data = input[i].split("->");
            String type = data[0];
            double price = Double.parseDouble(data[1]);
            switch (type) {
                case "Clothes":
                    if (price <= 50 && budget >= price) {
                        profit += price;
                        budget -= price;
                        double bonusPrice = price * 1.4;
                        soldItems.add(bonusPrice);

                    }
                    break;
                case "Shoes":
                    if (price <= 35 && budget >= price) {
                        profit += price;
                        budget -= price;
                        double bonusPrice = price * 1.4;
                        soldItems.add(bonusPrice);
                    }
                    break;
                case "Accessories":
                    if (price <= 20.50 && budget >= price) {
                        profit += price;
                        budget -= price;
                        double bonusPrice = price * 1.4;
                        soldItems.add(bonusPrice);
                    }
                    break;
            }
        }
        for (Double soldItem : soldItems) {
            budget += soldItem;
        }

        for (int i = 0; i < soldItems.size(); i++) {
            System.out.printf("%.2f", soldItems.get(i));
            if (i != soldItems.size() - 1) {
                System.out.print(" ");
            }

        }
        System.out.println();
        if (budget >= 150) {
            System.out.println(String.format("Profit: %.2f", profit * 0.4));
            System.out.println("Hello, France!");
        } else {
            System.out.println(String.format("Profit: %.2f", profit * 0.4));
            System.out.println("Time to go.");
        }
    }
}
