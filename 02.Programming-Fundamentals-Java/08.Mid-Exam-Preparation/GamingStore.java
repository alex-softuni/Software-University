package com.company;

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double currentBalance = Double.parseDouble(scanner.nextLine());

        double moneySpent = 0;
        double remaining = 0;
        String input = scanner.nextLine();
        while (!input.equals("Game Time")) {
            switch (input) {
                case "OutFall 4":
                    double price = 39.99;
                    if (currentBalance >= price) {
                        currentBalance -= price;
                        moneySpent += price;
                        System.out.println(String.format("Bought %s", input));
                    } else {
                        System.out.println("Too Expensive");
                      break;
                    }
                    break;
                case "CS: OG":
                    price = 15.99;
                    if (currentBalance >= price) {
                        currentBalance -= price;
                        moneySpent += price;
                        System.out.println(String.format("Bought %s", input));
                    } else {
                        System.out.println("Too Expensive");
                        break;
                    }
                    break;
                case "Zplinter Zell":
                    price = 19.99;
                    if (currentBalance >= price) {
                        currentBalance -= price;
                        moneySpent += price;
                        System.out.println(String.format("Bought %s", input));
                    } else {
                        System.out.println("Too Expensive");
                        break;
                    }
                    break;
                case "Honored 2":
                    price = 59.99;
                    if (currentBalance >= price) {
                        currentBalance -= price;
                        moneySpent += price;
                        System.out.println(String.format("Bought %s", input));
                    } else {
                        System.out.println("Too Expensive");
                        break;
                    }
                    break;
                case "RoverWatch":
                    price = 29.99;
                    if (currentBalance >= price) {
                        currentBalance -= price;
                        moneySpent += price;
                        System.out.println(String.format("Bought %s", input));
                    } else {
                        System.out.println("Too Expensive");
                        break;
                    }
                    break;
                case "RoverWatch Origins Edition":
                    price = 39.99;
                    if (currentBalance >= price) {
                        currentBalance -= price;
                        moneySpent += price;
                        System.out.println(String.format("Bought %s", input));
                    } else {
                        System.out.println("Too Expensive");
                        break;
                    }
                    break;
                default:
                    System.out.println("Not Found");
            }
            if (currentBalance == 0) {
                System.out.println("Out of money!");
                return;
            }
            input = scanner.nextLine();
        }
        remaining = currentBalance;
        System.out.println(String.format("Total spent: $%.2f. Remaining: $%.2f",
                moneySpent, remaining));
    }
}
