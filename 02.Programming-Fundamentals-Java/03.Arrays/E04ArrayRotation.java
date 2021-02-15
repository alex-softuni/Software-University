package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class E04ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(" ");
        int rotations = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < rotations; i++) {
             String firstElement = array[0];
             // shift left
            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j+1];
            }
            // add first element to last position
            array[array.length - 1] = firstElement;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
