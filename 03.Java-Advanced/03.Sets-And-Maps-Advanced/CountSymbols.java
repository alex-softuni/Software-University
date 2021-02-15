package Exercises;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        Map<Character, Integer> charOccurrence = new TreeMap<>();

        for (int i = 0; i < str.length(); i++) {
            char symbol = str.charAt(i);

            if (!charOccurrence.containsKey(symbol)) {
                charOccurrence.put(symbol, 1);
            } else {
                charOccurrence.put(symbol, charOccurrence.get(symbol) + 1);
            }
        }

        charOccurrence.forEach((key, value) -> System.out.println(String.format("%c: %d time/s", key, value)));
    }
}
