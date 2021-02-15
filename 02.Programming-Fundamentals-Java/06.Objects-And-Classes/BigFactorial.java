package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        BigInteger sum = new BigInteger(String.valueOf(1));
        for (int i = n; i > 1; i--) {
            sum = sum.multiply(BigInteger.valueOf(Integer.parseInt(String.valueOf(i))));
        }
        System.out.println(sum);
    }
}
