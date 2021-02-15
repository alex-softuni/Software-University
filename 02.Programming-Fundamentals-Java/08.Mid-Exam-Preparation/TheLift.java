package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int waitingPeople = Integer.parseInt(scanner.nextLine());
        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        boolean isFull = true;
        while (true) {
            for (int i = 0; i < array.length; i++) {
                int currentState = array[i];
                if (waitingPeople >= 4 && currentState == 0) {
                    array[i] += 4;
                    waitingPeople -= 4;
                } else {
                    if (waitingPeople >= 4) {
                        int seatsLeft = 4 - array[i];
                        array[i] += seatsLeft;
                        waitingPeople -= seatsLeft;
                    } else {
                        array[i] += waitingPeople;
                        waitingPeople -= waitingPeople;
                    }

                }
                if (array[i] < 4) {
                    isFull = false;
                }
            }
            // If wagons are full and there are still people waiting
            if (isFull && waitingPeople > 0) {
                System.out.println(String.format("There isn't enough space! %d people in a queue!", waitingPeople));
                for (int i1 : array) {
                    System.out.print(i1 + " ");
                }
                return;
                // If wagons are  full and no people waiting
            } else if (isFull && waitingPeople == 0) {
                for (int i1 : array) {
                    System.out.print(i1 + " ");
                }
                return;
                // If wagon are not full and no people waiting
            } else {
                System.out.println(String.format("The lift has empty spots!"));
                for (int i1 : array) {
                    System.out.print(i1 + " ");
                }
                return;
            }
        }
    }
}