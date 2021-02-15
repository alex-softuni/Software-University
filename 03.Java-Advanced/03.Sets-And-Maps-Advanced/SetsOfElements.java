package Exercises;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] setLength = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();

        for (int i = 0; i < setLength[0]; i++) {
            firstSet.add(Integer.parseInt(scanner.nextLine()));
        }
        for (int i = 0; i < setLength[1]; i++) {
            secondSet.add(Integer.parseInt(scanner.nextLine()));
        }

        firstSet.forEach(e -> {
            if (secondSet.contains(e)) {
                System.out.print(e + " ");
            }
        });
    }

}
