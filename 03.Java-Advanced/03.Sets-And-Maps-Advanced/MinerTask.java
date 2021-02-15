package Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> resources = new LinkedHashMap<>();

        String currentResource = "";

        String input = scanner.nextLine();
        while (!input.equals("stop")) {
            char symbol = input.charAt(0);
            if (!Character.isDigit(symbol)) {
                currentResource = input;
                resources.putIfAbsent(input, 0);
            } else {
                int quantity = Integer.parseInt(input);
                int value = resources.get(currentResource);
                resources.put(currentResource, value + quantity);
            }

            input = scanner.nextLine();
        }

        resources.entrySet()
                .forEach(entry -> System.out.println(String.format("%s -> %d", entry.getKey(), entry.getValue())));
    }
}
