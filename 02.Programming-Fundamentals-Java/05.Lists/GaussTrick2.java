import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GaussTrick2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// INPUT
        List<Integer> numbers = parseInt(scanner);
// Implementing logic
        int size = numbers.size();
        for (int i = 0; i < size / 2; i++) {
            numbers.set(i, numbers.get(i) + numbers.get(numbers.size() - 1));
            numbers.remove(numbers.size() - 1);
        }
        printEachNumber(numbers);

    }

    private static void printEachNumber(List<Integer> numbers) {
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }

    private static List<Integer> parseInt(Scanner scanner) {
        List<Integer> numbers = new ArrayList<>();
        String line = scanner.nextLine();
        String[] numbersAsStrings = line.split(" ");
        for (String numbersAsString : numbersAsStrings) {
            numbers.add(Integer.parseInt(numbersAsString));
        }
        return numbers;
    }
}

