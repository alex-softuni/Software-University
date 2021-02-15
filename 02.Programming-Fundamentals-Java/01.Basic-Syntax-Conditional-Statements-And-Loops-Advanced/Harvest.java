package com;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int xSquareMetersArea = Integer.parseInt(scanner.nextLine());
        double grapesPerSquareMeter = Double.parseDouble(scanner.nextLine());
        int wineNeeded = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double totalGrape = xSquareMetersArea * grapesPerSquareMeter;

        double totalWine = 0.4 * totalGrape / 2.5;

        double wineLeft = Math.abs(totalWine - wineNeeded);

        double workersBonus = (wineLeft / workers);

        if (totalWine < wineNeeded) {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.",Math.floor(wineLeft));
        } else {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.",Math.floor(totalWine));
            System.out.printf("%n%.0f liters left -> %.0f liters per person.",Math.ceil(wineLeft),Math.ceil(workersBonus));
        }
    }
}
