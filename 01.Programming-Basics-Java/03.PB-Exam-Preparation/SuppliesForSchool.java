package com.company;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        double detergentLitres = Double.parseDouble(scanner.nextLine());
        int percentDiscount = Integer.parseInt(scanner.nextLine());


        double allSum = (pens * 5.80) +
                (markers * 7.20) +
                (detergentLitres * 1.20);
        allSum = allSum - (allSum * percentDiscount / 100);
        System.out.printf("%.3f", allSum);

    }
}
