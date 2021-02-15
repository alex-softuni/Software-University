package Exercises;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String place = "";
        String type = "";
        double price = 0;

        if (budget <= 100) {
            place = "Bulgaria";
            if (season.equals("summer")) {
                type = "Camp";

                price = budget * 0.7 - budget;
            } else if (season.equals("winter")) {
                type = "Hotel";
                price = budget * 0.3 - budget;
            }
        } else if (budget <= 1000) {
            place = "Balkans";
            if (season.equals("summer")) {
                type = "Camp";
                price = budget * 0.6 - budget;
            } else if (season.equals("winter")) {
                type = "Hotel";
                price = budget * 0.2 - budget;
            }
        } else if (budget > 1000) {
            type = "Hotel";
            place = "Europe";
            price = budget * 0.1 - budget;
        }
        System.out.printf("Somewhere in %s", place);
        System.out.printf("%n%s - %.2f", type, Math.abs(price));
    }
}

