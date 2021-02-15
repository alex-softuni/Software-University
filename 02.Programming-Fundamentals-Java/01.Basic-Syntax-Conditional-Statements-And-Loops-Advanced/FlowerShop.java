package com;

import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int magnolias = Integer.parseInt(scanner.nextLine());
        int hyacinths = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int cactus = Integer.parseInt(scanner.nextLine());

        double giftPrice = Double.parseDouble(scanner.nextLine());

        double allSum = (magnolias * 3.25) +
                (hyacinths * 4.00) +
                (roses * 3.50) +
                (cactus * 8.00);
        allSum = allSum * 0.95;

        double diff = Math.abs(allSum - giftPrice);

        if (allSum >= giftPrice) {
            System.out.printf("She is left with %.0f leva.", Math.floor(diff));
        } else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(diff));
        }

    }
}
