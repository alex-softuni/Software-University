package FirstSteps.exercises;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogs = Integer.parseInt(scanner.nextLine());
        int others = Integer.parseInt(scanner.nextLine());
        double foodprice = 2.50 * dogs;
        double otherPrice = 4.00 * others;
        double totalSum = foodprice + otherPrice;
        System.out.println(totalSum +   " lv.");




    }
}
