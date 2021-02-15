package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CounterGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        int countCycles = 0;
        while (list.size() > 0) {

            for (int i = 0; i < list.size(); i++) {

                if (i % 2 != 0) {
                    list.remove(list.size() - 1);
                    System.out.printf("Person at odd index gotta go%n");
                } else if (i % 2 == 0) {
                    list.remove(0);
                    System.out.printf("Person at even index gotta go%n");
                }
                if (list.size() == 0) {
                    System.out.printf("CounterGame finished");
                    break;
                }
            }
        }


    }
}
