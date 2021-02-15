import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E01SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = parseInt(scanner);

        int i = 0;
        while (i >= 0 && i < numbers.size()- 1){
            int current = numbers.get(i);
            int next = numbers.get(i + 1);
            if (current == next){
                numbers.set(i,current + next);
                numbers.remove(i + 1);
                i = 0;
            } else {
                i++;
            }
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }


    }

    private static List<Integer> parseInt(Scanner scanner) {
        String line = scanner.nextLine();
        String[] numbersAsStrings = line.split(" ");

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < numbersAsStrings.length; i++) {
            numbers.add(Integer.parseInt(numbersAsStrings[i]));
        }
        return numbers;
    }
}






