import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class CountUpperCaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] text = scanner.nextLine().split("\\s+");

        Predicate<String> predicate = str -> Character.isUpperCase(str.charAt(0));
        long count = Arrays.stream(text)
                .filter(predicate)
                .count();

        System.out.println(count);

        Arrays.stream(text)
                .filter(predicate)
                .forEach(System.out::println);
    }
}
