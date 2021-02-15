import java.lang.reflect.Array;
import java.util.*;

public class E07RemoveNegativeAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();

        int count = 0;
        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                numbers.add(array[i]);
                count++;
            }
        }
        Collections.reverse(numbers);
        if (count == 0) {
            System.out.println("empty");
        } else {
            for (Integer number : numbers) {
                System.out.print(number + " ");
            }
        }

    }
}
