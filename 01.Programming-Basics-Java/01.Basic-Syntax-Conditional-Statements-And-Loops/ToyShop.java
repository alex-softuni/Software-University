package ConditionalStatements.lab.excercises.Lab;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 	Пъзел - 2.60 лв.
        //Говореща кукла - 3 лв.
        //Плюшено мече - 4.10 лв.
        //Миньон - 8.20 лв.
        //Камионче - 2 лв.
        double priceTrip = Double.parseDouble(scanner.nextLine());
        int countPuzzle = Integer.parseInt(scanner.nextLine());
        int countDolls = Integer.parseInt(scanner.nextLine());
        int countTeddy = Integer.parseInt(scanner.nextLine());
        int countMinions = Integer.parseInt(scanner.nextLine());
        int countTrucks = Integer.parseInt(scanner.nextLine());

        double allSum = (countPuzzle * 2.60) + (countDolls * 3.00) +
        (countTeddy * 4.10) + (countMinions * 8.20) + (countTrucks * 2.00);
        double toysSum = countPuzzle + countDolls + countTeddy + countMinions + countTrucks;

        if (toysSum >= 50){
            allSum = allSum - (allSum * 0.25);
        }
        allSum = allSum - (allSum * 0.10);
        double diff = Math.abs(allSum - priceTrip);

        if (allSum >= priceTrip){
            System.out.printf("Yes! %.2f lv left.",diff);
        }else {
            System.out.printf("Not enough money! %.2f lv needed.",diff);
        }


    }
}
