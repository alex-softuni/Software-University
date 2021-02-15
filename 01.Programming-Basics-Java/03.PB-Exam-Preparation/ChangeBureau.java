package com.company;

import java.util.Scanner;

public class ChangeBureau {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bitcoin = Integer.parseInt(scanner.nextLine());
        double yuan = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine());
        commission = 1.00 - commission / 100;
        double bitcoinToEuro = (1168 * bitcoin);
        double yuanToEuro = (0.15 * yuan) * 1.76;
        double allSum = (bitcoinToEuro + yuanToEuro) / 1.95;
        double sumAfterCommission = allSum * commission;
        System.out.printf("%.2f",sumAfterCommission);


    }
}
