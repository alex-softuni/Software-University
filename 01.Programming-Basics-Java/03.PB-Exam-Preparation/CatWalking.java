package com.company;

import java.util.Scanner;

public class CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutesPerDay = Integer.parseInt(scanner.nextLine());
        int walksPerDay =Integer.parseInt(scanner.nextLine());
        int caloriesPerDay = Integer.parseInt(scanner.nextLine());

        double totalCalories = (minutesPerDay * walksPerDay) * 5;

        if (totalCalories >= caloriesPerDay / 2){
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %.0f.",totalCalories);
        } else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %.0f.",totalCalories);
        }

    }
}
