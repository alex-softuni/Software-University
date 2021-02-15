package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class E09LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fieldSize = Integer.parseInt(scanner.nextLine());
        int[] indexes = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int arr[] = new int[fieldSize];

        for (int i = 0; i < indexes.length; i++) {
            if (indexes[i] >= 0 && indexes[i] < arr.length) {
                arr[indexes[i]] = 1;

            }

        }
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] data = input.split(" ");

            String directions = data[1];
            int bugIndex = Integer.parseInt(data[0]);
            int flyLength = Integer.parseInt(data[2]);

            if (bugIndex < 0 || bugIndex >= arr.length || arr[bugIndex] == 0) {
                continue;
            }

            switch (directions) {
                case "right":
                    arr[bugIndex] = 0;
                    int nextPosition = bugIndex + flyLength;
                    while (true) {
                        if (nextPosition >= arr.length) {
                            break;
                        }
                        if (arr[nextPosition] == 0) {
                            arr[nextPosition] = 1;
                            arr[bugIndex] = 0;
                        } else {
                            nextPosition++;
                        }
                    }
                    break;
                case "left":
                    arr[bugIndex] = 0;
                    int newPosition = bugIndex - flyLength;
                    while (true) {
                        if (newPosition <= arr.length) {
                            break;
                        }
                        if (arr[newPosition] == 0) {
                            arr[newPosition] = 1;
                            arr[bugIndex] = 0;
                        } else {
                            newPosition--;
                        }
                    }
                    break;
            }
            input = scanner.nextLine();
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
