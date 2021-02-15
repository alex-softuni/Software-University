import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Consumer<String> print = System.out::println;
        String[] names = scanner.nextLine().split("\\s+");

        Arrays.stream(names).forEach(print);

    }
}
