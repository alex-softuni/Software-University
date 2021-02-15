package Exercises;

import java.util.*;

public class HandsOfCards {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Set<String>> player = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("JOKER")) {
            String[] data = input.split(":\\s+");
            String[] deck = data[1].split(",\\s+");
            String name = data[0];

            if (!player.containsKey(name)) {
                player.put(name, new HashSet<>());
            }
            for (String card : deck) {
                player.get(name).add(card);
            }

            input = scanner.nextLine();
        }
        for (Map.Entry<String, Set<String>> playerInfo : player.entrySet()) {
            int power = calculatePower(playerInfo.getValue());
            System.out.printf("%s: %d%n", playerInfo.getKey(), power);
        }


    }

    private static int calculatePower(Set<String> value) {
        int power = 0;

        for (String card : value) {
            StringBuilder sb = new StringBuilder();
            char[] array = card.toCharArray();
            for (int i = 0; i < array.length; i++) {
                if (Character.isDigit(array[i])) {
                    sb.append(array[i]);
                }
            }
            char firstSymbol = card.charAt(0);
            char secondSymbol = '0';
            for (int i = 1; i < array.length; i++) {
                if (Character.isLetter(array[i])) {
                    secondSymbol = array[i];
                }
            }

            int num = 0;
            int multiplier = 0;

            switch (secondSymbol) {
                case 'S':
                    multiplier = 4;
                    break;
                case 'H':
                    multiplier = 3;
                    break;
                case 'D':
                    multiplier = 2;
                    break;
                case 'C':
                    multiplier = 1;
                    break;
            }

            if (Character.isDigit(firstSymbol)) {
                num = Integer.parseInt(String.valueOf(sb));
                power += num * multiplier;
            } else {
                switch (firstSymbol) {
                    case 'A':
                        num = 14;
                        break;
                    case 'K':
                        num = 13;
                        break;
                    case 'Q':
                        num = 12;
                        break;
                    case 'J':
                        num = 11;
                        break;
                }
                power += num * multiplier;
            }
        }
        return power;
    }
}






