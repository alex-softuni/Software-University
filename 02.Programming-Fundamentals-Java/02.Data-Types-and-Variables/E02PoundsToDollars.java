package com.company;

import java.math.BigDecimal;
import java.util.Scanner;

public class E02PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dollars = Double.parseDouble(scanner.nextLine());
        dollars *= 1.31;
        System.out.printf("%.3f", dollars);
    }
}
