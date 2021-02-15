package com.company;

import java.util.*;

public class NumbersDescription {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        double avgSum = 1.0 * Arrays.stream(array).sum() / array.length;

        List<Integer> list = new ArrayList<>();
        for (int i : array) {
            if (i > avgSum) {
                list.add(i);
            }
        }
        Collections.sort(list);
        Collections.reverse(list);
        if (list.isEmpty()) {
            System.out.println("No");
        } else {
            for (int i = 0; i < Math.min(list.size(), 5); i++) {
                System.out.print(list.get(i) + " ");
            }

        }
    }
}

