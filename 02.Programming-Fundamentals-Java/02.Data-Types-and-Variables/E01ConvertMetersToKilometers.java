package com.company;

import java.util.Locale;
import java.util.Scanner;

public class E01ConvertMetersToKilometers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distance = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.2f",(double)distance / 1000);


    }
}


