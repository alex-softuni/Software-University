
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int divider = Integer.parseInt(scanner.nextLine());

        Predicate<Integer> predicate = num -> num % divider != 0;
        Collections.reverse(numbers);
        numbers = numbers.stream().filter(predicate).collect(Collectors.toList());

        numbers.forEach(e -> System.out.printf("%d ", e));
    }
}
