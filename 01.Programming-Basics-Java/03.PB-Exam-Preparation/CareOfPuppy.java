package com.company;

import java.util.Scanner;

public class CareOfPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int foodPerKg = Integer.parseInt(scanner.nextLine());
foodPerKg *= 1000;
        int totalEaten = 0;

        String input = scanner.nextLine();
        while (!input.equals("Adopted")){
            int foodEaten = Integer.parseInt(input);
            totalEaten += foodEaten;
            input = scanner.nextLine();
        }
        double diff = Math.abs(totalEaten - foodPerKg);
        if (totalEaten <= foodPerKg){
            System.out.printf("Food is enough! Leftovers: %.0f grams.",diff);
        } else if (totalEaten >= foodPerKg){
            System.out.printf("Food is not enough. You need %.0f grams more.",diff);
        }
    }
}
