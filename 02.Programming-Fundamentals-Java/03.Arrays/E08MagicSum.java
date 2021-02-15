package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class E08MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();
        int specialNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == specialNumber) {
                    System.out.println(array[i] + " " + array[j]);
                }
            }
        }
    }
}
