package FirstSteps.exercises2;

import java.util.Scanner;


public class FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double strawberryPrice = Double.parseDouble(scanner.nextLine());
        double bananasWeight = Double.parseDouble(scanner.nextLine());
        double orangeWeight = Double.parseDouble(scanner.nextLine());
        double raspberryWeight = Double.parseDouble(scanner.nextLine());
        double strawberryWeight = Double.parseDouble(scanner.nextLine());

        double raspberryPrice = 0.5 * strawberryPrice;
        double orangesPrice = raspberryPrice - (0.4 * raspberryPrice);
        double bananasPrice = raspberryPrice - (0.8 * raspberryPrice);

        double raspberryTotal = raspberryPrice * raspberryWeight;
        double orangesTotal = orangesPrice * orangeWeight;
        double bananasTotal = bananasPrice * bananasWeight;
        double strawberryTotal = strawberryPrice * strawberryWeight;

        double totalSum = raspberryTotal + orangesTotal + bananasTotal + strawberryTotal;

        System.out.printf("%.2f",totalSum);
        }
    }

