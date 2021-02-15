package Lab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rotations = Integer.parseInt(scanner.nextLine());

        TreeMap<String, Double> studentsBook = new TreeMap<>();

        for (int i = 0; i < rotations; i++) {
            String name = scanner.nextLine();
            double[] grades = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToDouble(Double::parseDouble)
                    .toArray();
            double average = 0;
            for (double grade : grades) {
                average += grade;
            }
            if (!studentsBook.containsKey(name)) {
                studentsBook.put(name, average / grades.length);
            }
        }
        studentsBook.entrySet()
                .stream()
                .forEach(e -> System.out.printf("%s is graduated with %s%n", e.getKey(), e.getValue()));
    }
}

