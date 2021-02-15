package Exercises;

import java.util.Scanner;

public class E07VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalMoney = 0;
        String input = scanner.nextLine();
        while (!input.equals("Start")) {
            double money = Double.parseDouble(input);
            if (money == 0.1 || money == 0.2 || money == 0.5
                    || money == 1 || money == 2) {
                totalMoney += money;
            } else {
                System.out.println(String.format("Cannot accept %.2f", money));
            }
            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        while (!input.equals("End")) {
            switch (input) {
                case "Nuts":
                    if (totalMoney >= 2) {
                        totalMoney -= 2.0;
                        System.out.println("Purchased Nuts");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    if (totalMoney >= 0.7) {
                        totalMoney -= 0.7;
                        System.out.println("Purchased Water");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    if (totalMoney >= 1.5) {
                        totalMoney -= 1.5;
                        System.out.println("Purchased Crisps");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    if (totalMoney >= 0.8) {
                        totalMoney -= 0.8;
                        System.out.println("Purchased Soda");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    if (totalMoney >= 1.0) {
                        totalMoney -= 1.0;
                        System.out.println("Purchased Coke");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println(String.format("Change: %.2f", totalMoney));
    }
}

