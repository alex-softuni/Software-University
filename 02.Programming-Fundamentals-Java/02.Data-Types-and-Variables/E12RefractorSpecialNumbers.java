package com.company;

import java.util.Scanner;

public class E12RefractorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        boolean isSpecialNumber = false;
        for (int num = 1; num <= n; num++) {
            int digit = 0;
            int sum = 0;
            digit = num;
            while (num > 0) {
                sum += num % 10;
                num = num / 10;
            }

            isSpecialNumber = (sum == 5) || (sum == 7) || (sum == 11);
            String tF;
            if (isSpecialNumber){
                tF= "True";
            } else {
                tF= "False";
            }
            System.out.printf("%d -> %s%n", digit, tF);
            num = digit;

        }

    }
}
