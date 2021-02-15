package com.company;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groups = Integer.parseInt(scanner.nextLine());
        int mussala = 0;
        int montblanc = 0;
        int kilimanjaro = 0;
        int k2 = 0;
        int everest = 0;
        String input = scanner.nextLine();
        for (int i = 1; i <= groups; i++) {
            int climbers = Integer.parseInt(input);

            if (climbers <= 5) {
                mussala += climbers;
            } else if (climbers >= 6 && climbers <= 12) {
                montblanc += climbers;
            } else if (climbers >= 13 && climbers <= 25) {
                kilimanjaro += climbers;
            } else if (climbers >= 26 && climbers <= 40) {
                k2 += climbers;
            } else if (climbers >= 41) {
                everest += climbers;
            }
            if (i == groups) {
                break;
            }
            input = scanner.nextLine();
        }
        int totalClimbers = mussala + montblanc + kilimanjaro + k2 + everest;
        double mussallaPercent = 1.0 * mussala / totalClimbers * 100;
        double montblancPercent = 1.0 * montblanc / totalClimbers * 100;
        double kilimanjaroPercent = 1.0 * kilimanjaro / totalClimbers * 100;
        double k2Percent = 1.0 * k2 / totalClimbers * 100;
        double everestPercent = 1.0 * everest / totalClimbers * 100;

        System.out.printf("%.2f%%", mussallaPercent);
        System.out.printf("%n%.2f%%", montblancPercent);
        System.out.printf("%n%.2f%%", kilimanjaroPercent);
        System.out.printf("%n%.2f%%", k2Percent);
        System.out.printf("%n%.2f%%", everestPercent);

    }
}