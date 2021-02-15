package com.company;

import java.util.Scanner;

public class SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int productiveTime = scanner.nextInt() + scanner.nextInt() + scanner.nextInt();
        int countStudents = scanner.nextInt();

        int hours = 0;

        while (countStudents > 0) {
            hours++;
            if (hours % 4 != 0) {
                countStudents -= productiveTime;
            }
        }
        System.out.printf("Time needed: %dh.", hours);
    }
}
