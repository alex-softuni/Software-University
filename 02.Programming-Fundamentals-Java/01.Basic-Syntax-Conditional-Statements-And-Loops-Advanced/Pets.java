package com;

import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int food = Integer.parseInt(scanner.nextLine());

        double dogFood = Double.parseDouble(scanner.nextLine());
        double catFood = Double.parseDouble(scanner.nextLine());
        double turtleFood = Double.parseDouble(scanner.nextLine());

        double foodNeeded = (dogFood * days) +
                (catFood * days) +
                (turtleFood * days / 1000);
        double foodDiff = Math.abs(food - foodNeeded);
        if (foodNeeded <= food) {
            System.out.printf("%.0f kilos of food left.", Math.floor(foodDiff));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(foodDiff));
        }


    }
}
