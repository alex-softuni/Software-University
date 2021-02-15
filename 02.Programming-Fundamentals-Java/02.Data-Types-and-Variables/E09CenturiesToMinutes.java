package com.company;

import java.util.Scanner;

public class E09CenturiesToMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte centuries = scanner.nextByte();
        short years = (short) (centuries * 100);
        int days = (int) (years * 365.2422);
        int hours = days * 24;
        int minutes = hours * 60;

        System.out.printf("%d centuries = %d years = %d days = %d hours = %d minutes",
                centuries,
                years,
                days,
                hours,
                minutes
        );
    }
}
