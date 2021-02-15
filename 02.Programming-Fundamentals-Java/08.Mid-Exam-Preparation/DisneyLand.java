package com.company;

import java.util.Scanner;

public class DisneyLand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double price = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double totalSaving = 0;
        for (int i = 1; i <= months; i++) {
            if (i != 1 && i % 2 == 1) {
                totalSaving -= totalSaving * 0.16;
            }
            if (i % 4 == 0) {
                totalSaving += totalSaving * 0.25;
            }
            totalSaving += price * 0.25;

        }
        if (totalSaving >= price) {
            System.out.println(String.format("Bravo! You can go to Disneyland and you will have %.2flv. for souvenirs.", totalSaving - price));
        } else {
            System.out.println(String.format("Sorry. You need %.2flv. more.", Math.abs(totalSaving - price)));
        }
    }
}
