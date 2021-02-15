package com;

import java.util.Scanner;

public class Firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double offDutyWorkers = Math.floor(workers * 2 * days);
        double dutyWorkers = Math.floor(days * 0.90 * 8);

        double totalHours = offDutyWorkers + dutyWorkers;

        if (hours <= totalHours) {
            System.out.printf("Yes!%.0f hours left.", Math.abs(totalHours - hours));
        } else {
            System.out.printf("Not enough time!%.0f hours needed.", Math.abs(totalHours - hours));
        }


    }
}
