package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> listOfItems = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Craft!")) {
            String[] data = input.split(" - ");
            String command = data[0];
            String item = data[1];

            switch (command) {
                case "Collect":
                    if (!listOfItems.contains(item)) {
                        listOfItems.add(item);
                    }
                    break;
                case "Drop":
                    if (listOfItems.contains(item)) {
                        listOfItems.remove(item);
                    }
                    break;
                case "Combine Items":
                    String[] combinedItems = item.split(":");
                    String oldItem = combinedItems[0];
                    String newItem = combinedItems[1];

                    if (listOfItems.contains(oldItem)) {
                        int index = listOfItems.indexOf(oldItem);
                        listOfItems.add(index + 1, newItem);
                    }
                    break;
                case "Renew":
                    if (listOfItems.contains(item)) {
                        listOfItems.remove(item);
                        listOfItems.add(item);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println(String.join(", ", listOfItems));
    }
}
