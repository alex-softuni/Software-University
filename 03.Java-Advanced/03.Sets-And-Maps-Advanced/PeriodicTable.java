package Exercises;

import java.util.*;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Set<String> chemistryElements = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            chemistryElements.addAll(Arrays.asList(input));
        }

        chemistryElements.forEach(e -> System.out.printf("%s ", e));
    }
}
