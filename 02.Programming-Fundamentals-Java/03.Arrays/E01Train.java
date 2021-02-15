package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class E01Train {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wagons = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        int[] people = new int[wagons];

        for (int i = 0; i < wagons; i++) {
            people[i] = Integer.parseInt(scanner.nextLine());
            System.out.print(people[i] + " ");
            sum += people[i];
        }
        System.out.printf("%n%d",sum);
    }
}
