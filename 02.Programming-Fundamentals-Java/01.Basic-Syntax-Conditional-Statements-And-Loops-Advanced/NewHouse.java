package Exercises;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowersType = scanner.nextLine();
        int flowersQuantity = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (flowersType) {
            case "Roses":
                price = flowersQuantity * 5;
                if (flowersQuantity > 80) {
                    price *= 0.9;
                }
                break;
            case "Dahlias":
                price = flowersQuantity * 3.80;
                if (flowersQuantity > 90) {
                    price *= 0.85;
                }
                break;
            case "Tulips":
                price = flowersQuantity * 2.80;
                if (flowersQuantity > 80) {
                    price *= 0.85;
                }
                break;
            case "Narcissus":
                price = flowersQuantity * 3;
                if (flowersQuantity < 120) {
                    price *= 1.15;
                }
                break;
            case "Gladiolus":
                price = flowersQuantity * 2.50;
                if (flowersQuantity < 80) {
                    price *= 1.20;
                }
                break;
        }

        if (budget >= price) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowersQuantity, flowersType, Math.abs(price - budget));
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(price - budget));
        }


    }
}
