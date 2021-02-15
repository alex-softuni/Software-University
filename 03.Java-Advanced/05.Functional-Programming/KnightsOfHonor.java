import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Consumer<String> print = str -> System.out.println("Sir " + str);
        String[] names = scanner.nextLine().split("\\s+");

        Arrays.stream(names).forEach(print);

    }
}

