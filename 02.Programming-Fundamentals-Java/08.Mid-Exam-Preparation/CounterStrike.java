package com.company;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int energy = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        String input = scanner.nextLine();
        while (!input.equals("End of battle")) {
            int distance = Integer.parseInt(input);
            if (energy < distance) {
                System.out.println(String.format("Not enough energy! Game ends with %d won battles and %d energy",
                        counter, energy));
                return;
            }
            energy -= distance;
            counter++;
            if (counter % 3 == 0) {
                energy += counter;
            }
            input = scanner.nextLine();
        }
        System.out.println(String.format("Won battles: %d. Energy left: %d", counter, energy));
    }
}
