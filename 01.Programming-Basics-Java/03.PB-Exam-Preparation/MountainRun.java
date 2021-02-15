package com.company;

import java.util.Scanner;

public class MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timePerMeter = Double.parseDouble(scanner.nextLine());

        double slowDowns = Math.floor(distance / 50);
        slowDowns *= 30;

        double totalTime = (distance * timePerMeter) + slowDowns;

        double diff = Math.abs(totalTime - record);

        if (totalTime < record) {
            System.out.printf("Yes! The new record is %.2f seconds.", (totalTime));
        } else {
            System.out.printf("No! He was %.2f seconds slower.", diff);
        }


    }
}
