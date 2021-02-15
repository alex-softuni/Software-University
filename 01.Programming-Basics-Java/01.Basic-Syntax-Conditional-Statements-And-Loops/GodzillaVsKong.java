package ConditionalStatements.lab.excercises.Excercises;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        double pricePerCostume = Double.parseDouble(scanner.nextLine());

        double decorPrice = budget * 0.1;
        double costumeTotal = people * pricePerCostume;

        if (people >= 150) {
            costumeTotal = costumeTotal - costumeTotal * 0.1;
        }
        double totalExpenses = decorPrice + costumeTotal;
        double difference = Math.abs(totalExpenses - budget);

        if (totalExpenses > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", difference);
        } else if (totalExpenses <= budget) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", difference);
        }


    }
}
