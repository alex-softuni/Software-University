import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E05ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        String[] numbersAsStrings = line.split(" ");
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < numbersAsStrings.length; i++) {
            numbers.add(Integer.parseInt(numbersAsStrings[i]));
        }

        String input = scanner.nextLine();

        String[] commands = input.split(" ");
        while (!commands[0].equals("end")) {

            switch (commands[0]) {
                case "Contains":
                    if (!numbers.contains(Integer.parseInt(commands[1]))) {
                        System.out.println("No such number");
                    } else {
                        System.out.println("Yes");
                    }
                    break;
                case "Print":
                    if (commands[1].equals("even")) {
                        for (Integer even : numbers) {
                            if (even % 2 == 0) {
                                System.out.print(even + " ");
                            }
                        }
                        System.out.println();
                    } else if (commands[1].equals("odd")) {
                        for (Integer odd : numbers) {
                            if (odd % 2 != 0) {
                                System.out.print(odd + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "Get":
                    if (commands[1].equals("sum")) {
                        int sum = 0;
                        for (int num : numbers) {
                            sum += num;
                        }
                        System.out.printf("%d%n", sum);
                    }
                    break;
                case "Filter":
                    numFiltering(numbers, commands);
                    break;
            }

            commands = scanner.nextLine().split(" ");
        }
    }

    private static void numFiltering(List<Integer> numbers, String[] commands) {
        switch (commands[1]) {
            case ">=":
                for (Integer number : numbers) {
                    if (number >= Integer.parseInt(commands[2])) {
                        System.out.print(number + " ");
                    }
                }
                System.out.println();
                break;
            case "<=":
                for (Integer number : numbers) {
                    if (number <= Integer.parseInt(commands[2])) {
                        System.out.print(number + " ");
                    }
                }
                break;
            case ">":
                for (Integer number : numbers) {
                    if (number > Integer.parseInt(commands[2])) {
                        System.out.print(number + " ");
                    }
                }
                System.out.println();
                break;
            case "<":
                for (Integer number : numbers) {
                    if (number < Integer.parseInt(commands[2])) {
                        System.out.print(number + " ");
                    }
                }
                break;
        }
    }
}

