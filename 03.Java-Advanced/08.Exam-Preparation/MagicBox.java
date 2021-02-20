import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MagicBox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> firstMagicBox = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toCollection(ArrayDeque::new));

        ArrayDeque<Integer> secondMagicBox = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).forEach(secondMagicBox::push);
        int collectedItems = 0;

        while (!firstMagicBox.isEmpty() && !secondMagicBox.isEmpty()) {
            int firstBoxValue = firstMagicBox.peek();
            int secondBoxValue = secondMagicBox.pop();

            int sum = firstBoxValue + secondBoxValue;
            if (sum % 2 == 0) {
                collectedItems += sum;
                firstMagicBox.poll();
            } else {
                firstMagicBox.offer(secondBoxValue);
            }
        }

        String message = firstMagicBox.isEmpty()
                ? "First magic box is empty."
                : "Second magic box is empty.";

        String secondMessage = collectedItems >= 90
                ? "Wow, your prey was epic! Value: " + collectedItems
                : "Poor prey... Value: " + collectedItems;

        System.out.println(message);
        System.out.println(secondMessage);
    }
}
