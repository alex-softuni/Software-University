import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AppliedArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toCollection(ArrayList::new));

        Function<List<Integer>, List<Integer>> addFunc = num -> num.stream()
                .map(e -> e + 1).collect(Collectors.toList());

        Function<List<Integer>, List<Integer>> subtractFunc = num -> num.stream()
                .map(e -> e - 1).collect(Collectors.toList());

        Function<List<Integer>, List<Integer>> multiplyFunc = num -> num.stream()
                .map(e -> e * 2)
                .collect(Collectors.toList());

        Consumer printConsumer = num -> System.out.print(num + " ");


        String command = "";
        while (!"end".equals(command = scanner.nextLine())) {

            switch (command) {
                case "add":
                    numbers = addFunc.apply(numbers);
                    break;
                case "multiply":
                    numbers = multiplyFunc.apply(numbers);
                    break;
                case "subtract":
                    numbers = subtractFunc.apply(numbers);
                    break;
                case "print":
                    numbers.forEach(printConsumer);
                    System.out.println();
                    break;
            }
        }

    }
}
