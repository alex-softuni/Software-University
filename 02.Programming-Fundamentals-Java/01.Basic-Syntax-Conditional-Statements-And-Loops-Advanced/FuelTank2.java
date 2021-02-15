package com;

import java.util.Scanner;

public class FuelTank2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fuel = scanner.nextLine();
        double quantityFuel = Double.parseDouble(scanner.nextLine());
        String clubCard = scanner.nextLine();
        double price = 0;


        switch (fuel) {
            case "Gas":

                if (clubCard.equals("Yes")) {
                    price = (0.93 - 0.08) * quantityFuel;
                } else if (clubCard.equals("No")) {
                    price = 0.93 * quantityFuel;
                }

                if (quantityFuel >= 20 && quantityFuel <= 25) {
                    price *= 0.92;
                } else if (quantityFuel > 25) {
                    price *= 0.90;
                }

                break;

            case "Gasoline":

                if (clubCard.equals("Yes")) {
                    price = (2.22 - 0.18) * quantityFuel;
                } else if (clubCard.equals("No")) {
                    price = 2.22 * quantityFuel;
                }

                if (quantityFuel >= 20 && quantityFuel <= 25) {
                    price *= 0.92;
                } else if (quantityFuel > 25) {
                    price *= 0.90;
                }
                break;
            case "Diesel":
                if (clubCard.equals("Yes")) {
                    price = (2.33 - 0.12) * quantityFuel;
                } else if (clubCard.equals("No")) {
                    price = 2.33 * quantityFuel;
                }
                if (quantityFuel >= 20 && quantityFuel <= 25) {
                    price *= 0.92;
                } else if (quantityFuel > 25) {
                    price *= 0.90;
                }
                break;

        }
        System.out.printf("%.2f lv.", price);

    }
}
