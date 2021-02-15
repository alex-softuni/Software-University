import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E06CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstPlayer = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> secondPlayer = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        while (!(firstPlayer.isEmpty() || secondPlayer.isEmpty())) {
            int first = firstPlayer.get(0);
            int second = secondPlayer.get(0);

            if (first > second) {
                firstPlayer.add(first);
                firstPlayer.add(second);
            } else if (second > first) {
                secondPlayer.add(second);
                secondPlayer.add(first);
            }

            firstPlayer.remove(0);
            secondPlayer.remove(0);

        }
        int sum = 0;
        if (!firstPlayer.isEmpty()) {
            for (Integer integer : firstPlayer) {
                sum += integer;
            }
            System.out.println("First player wins! Sum: " + sum);
        } else if (!secondPlayer.isEmpty()) {
            for (Integer integer : secondPlayer) {
                sum += integer;
            }
            System.out.println("Second player wins! Sum: " + sum);
        }

    }
}
