package com;

import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int restDays = Integer.parseInt(scanner.nextLine());
        // Rest days - 127 minutes per Day
        // Working days - 63 minutes per Day

        int playTimeRestDays = restDays * 127;
        int playTimesWorkDays = (365 - restDays) * 63;
        int totalPlayTime = playTimeRestDays + playTimesWorkDays;
        int timeLeft = 30000 - totalPlayTime;
        int totalHours = timeLeft / 60;
        int totalMinutes = timeLeft % 60;

        if (totalPlayTime < 30000) {
            System.out.println("Tom sleeps well");
            System.out.printf(" %d hours and %d minutes less for play", totalHours, totalMinutes);
        }
        if (totalPlayTime > 30000) {
            int sum = totalPlayTime - 30000;
            int sumHours = sum / 60;
            int sumMinutes = sum % 60;
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", sumHours, sumMinutes);

        }
    }
}
