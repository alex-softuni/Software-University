package com;

import java.util.Scanner;

public class FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fuel = scanner.nextLine();
        int fuelLitres = Integer.parseInt(scanner.nextLine());

        switch (fuel) {
            case "Diesel":
                if (fuelLitres >= 25) {
                    System.out.printf("You have enough diesel.", fuel);
                } else if (fuelLitres < 25) {
                    System.out.printf("Fill your tank with diesel!", fuel);
                }
                break;
            case "Gasoline":
                if (fuelLitres >= 25) {
                    System.out.printf("You have enough gasoline.", fuel);
                } else if (fuelLitres < 25) {
                    System.out.printf("Fill your tank with gasoline!", fuel);
                }
                break;
            case "Gas":
                if (fuelLitres >= 25) {
                    System.out.printf("You have enough gas.", fuel);
                } else if (fuelLitres < 25) {
                    System.out.printf("Fill your tank with gas!", fuel);
                }
                break;
            default:
                System.out.println("Invalid fuel!");


        }
    }
}
