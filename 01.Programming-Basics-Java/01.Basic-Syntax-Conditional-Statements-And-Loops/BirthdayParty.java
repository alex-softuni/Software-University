package FirstSteps.exercises2;

import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
//•	Торта  – цената ѝ е 20% от наема на залата
//•	Напитки – цената им е 45% по-малко от тази на тортата
//•	Аниматор – цената му е 1/3 от цената за наема на залата
//•	Наем за залата – цяло число в интервала [100..10000]
        Scanner scanner = new Scanner(System.in);
        int rent = Integer.parseInt(scanner.nextLine());
        double cake = 0.2 * rent;
        double drinks = cake - (cake * 0.45);
        double animator = rent / 3;
        double budgetTotal = rent + cake + drinks + animator;

        System.out.println(budgetTotal);






    }
}
