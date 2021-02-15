package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class E06EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();


        int result;
        boolean areEqual = false;
        for (int i = 0; i < arr.length; i++) {
            int leftSum = 0;
            int rightSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }
            for (int k = arr.length - 1; k > i; k--) {
                rightSum += arr[k];
            }
            if (leftSum == rightSum) {
                areEqual = true;
                result = i;
                System.out.println(i);
                break;
            }
        }
        if (!areEqual){
            System.out.println("no");
        }
    }
}

