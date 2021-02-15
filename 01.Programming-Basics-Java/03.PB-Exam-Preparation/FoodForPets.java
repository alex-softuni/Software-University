package com.company;

import java.util.Scanner;

public class FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double food = Double.parseDouble(scanner.nextLine());

        double dog = 0;
        double cat = 0;
        double biscuits = 0;

        for (int i = 1; i <= days; i++) {
            int dogFood = Integer.parseInt(scanner.nextLine());
            int catFood = Integer.parseInt(scanner.nextLine());
            dog += dogFood;
            cat += catFood;

            if (i % 3 == 0) {
                double currentBiscuits = (catFood + dogFood) * 0.10;
                biscuits += currentBiscuits;
            }
        }
        double totalFood = cat + dog;
        double percentageFoodEaten = (totalFood * 100) / food;
        double dogFoodEaten = (dog / totalFood) * 100;
        double catFoodEaten = (cat / totalFood) * 100;

        System.out.printf("Total eaten biscuits: %.0fgr.", biscuits);
        System.out.printf("%n%.2f%% of the food has been eaten.", percentageFoodEaten);
        System.out.printf("%n%.2f%% eaten from the dog.", dogFoodEaten);
        System.out.printf("%n%.2f%% eaten from the cat.", catFoodEaten);
    }

}
