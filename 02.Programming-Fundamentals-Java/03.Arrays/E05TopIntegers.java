package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class E05TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]){
                System.out.print(array[i] + " ");

            }
            System.out.print(array[array.length-1]);
        }
    }
}
