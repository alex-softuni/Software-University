package Lab;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Double, Integer> result = new LinkedHashMap<>();

        double[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble).toArray();

        for (double number : numbers) {
            if (!result.containsKey(number)) {
                result.put(number, 1);
            } else {
                result.put(number, result.get(number) + 1);
            }
        }

        for (Double key : result.keySet()) {
            System.out.println(String.format("%.1f -> %d", key, result.get(key)));
        }


    }
}
