package com.company;

import java.util.Scanner;

public class MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int health = 100;
        int bitcoins = 0;

        String[] rooms = scanner.nextLine().split("\\|");
        for (int i = 0; i < rooms.length; i++) {
            String[] currentRoom = rooms[i].split(" ");
            String command = currentRoom[0];
            int input = Integer.parseInt(currentRoom[1]);

            switch (command) {
                case "potion":
                    int number = input;
                    if (health + number > 100) {
                        number = 100 - health;
                    }
                    health += number;
                    System.out.printf("You healed for %d hp.%n", number);
                    System.out.printf("Current health: %d hp.%n", health);
                    break;
                case "chest":
                    bitcoins += input;
                    System.out.printf("You found %d bitcoins.%n", input);
                    break;
                default:
                    health -= input;
                    if (health > 0) {
                        System.out.printf("You slayed %s.%n", command);
                    } else {
                        System.out.printf("You died! Killed by %s.%n", command);
                        System.out.printf("Best room: %d", i + 1);
                        return;
                    }
            }
        }
        System.out.printf("You've made it!%n" +
                        "Bitcoins: %d%n" +
                        "Health: %d", bitcoins
                , health);
    }
}
