package Exercises;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishers = Integer.parseInt(scanner.nextLine());
        double price = 0;

        switch (season) {
            case "Spring":
                price = 3000;
                if (fishers <= 6) {
                    price *= 0.90;
                } else if (fishers >= 7 && fishers <= 11) {
                    price *= 0.85;
                } else {
                    price *= 0.75;
                }
                if (fishers % 2 == 0) {
                    price *= 0.95;
                }
                break;
            case "Summer":
                price = 4200;
                if (fishers <= 6) {
                    price *= 0.90;
                } else if (fishers >= 7 && fishers <= 11) {
                    price *= 0.85;
                } else {
                    price *= 0.75;
                }
                if (fishers % 2 == 0) {
                    price *= 0.95;
                }
                break;
            case "Autumn":
                price = 4200;
                if (fishers <= 6) {
                    price *= 0.90;
                } else if (fishers >= 7 && fishers <= 11) {
                    price *= 0.85;
                } else {
                    price *= 0.75;
                }

                break;
            case "Winter":
                price = 2600;
                if (fishers <= 6) {
                    price *= 0.90;
                } else if (fishers >= 7 && fishers <= 11) {
                    price *= 0.85;
                } else {
                    price *= 0.75;
                }
                if (fishers % 2 == 0) {
                    price *= 0.95;
                }
                break;
        }
        if (budget >= price) {
            System.out.printf("Yes! You have %.2f leva left.", Math.abs(price - budget));
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", Math.abs(price - budget));
        }
    }
}
