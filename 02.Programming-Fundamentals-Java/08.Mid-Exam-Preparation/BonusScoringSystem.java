package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countStudents = Integer.parseInt(scanner.nextLine());
        int countLectures = Integer.parseInt(scanner.nextLine());
        int additionalBonus = Integer.parseInt(scanner.nextLine());

        List<Integer> students = new ArrayList<>();
        double maxBonus = 0;
        int maxAttendances = 0;

        for (int i = 0; i < countStudents; i++) {
            int attendances = Integer.parseInt(scanner.nextLine());
            double totalBonus = attendances / (double) countLectures * (5 + additionalBonus);
            if (totalBonus > maxBonus) {
                maxBonus = totalBonus;
                maxAttendances = attendances;
            }
        }
        System.out.printf("Max Bonus: %.0f.%n", maxBonus);
        System.out.printf("The student has attended %d lectures.", maxAttendances);
    }
}
