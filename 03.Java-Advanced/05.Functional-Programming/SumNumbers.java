import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(", ");
        Function<String, Integer> parser = Integer::parseInt;

        int sum = Arrays.stream(numbers)
                .mapToInt(parser::apply)
                .sum();
        long count = Arrays.stream(numbers)
                .mapToInt(parser::apply)
                .count();

        System.out.println("Count = " + count);
        System.out.println("Sum = " + sum);


    }
}
