

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E04ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = parseInt(scanner);

        String input = scanner.nextLine();
        String[] commands = input.split(" ");
        while (!commands[0].equals("end")) {
            switch (commands[0]) {
                case "Add":
                    numbers.add(Integer.parseInt(commands[1]));
                    break;
                case "Remove":
                    numbers.remove((Integer) Integer.parseInt(commands[1]));
                    break;
                case "RemoveAt":
                    int index = Integer.parseInt(commands[1]);
                    numbers.remove(index);
                    break;
                case "Insert":
                    int index1 = Integer.parseInt(commands[2]);
                    int digit = Integer.parseInt(commands[1]);
                    numbers.add(index1, digit);
                    break;
            }


            commands = scanner.nextLine().split(" ");
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
