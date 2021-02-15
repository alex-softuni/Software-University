import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];

            switch (command) {
                case "Contains":
                    if (numbers.contains(Integer.parseInt(tokens[1]))) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if ("even".equals(tokens[1])) {
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) % 2 == 0) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                        System.out.println();
                    } else if ("odd".equals(tokens[1])) {
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) % 2 != 0) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "Get":
                    if ("sum".equals(tokens[1])) {
                        int sum = 0;
                        for (int i = 0; i < numbers.size(); i++) {
                            sum += numbers.get(i);
                        }
                        System.out.println(sum);
                    }
                    break;
                case "Filter":
                    String operator = tokens[1];
                    int comparisonNum = Integer.parseInt(tokens[2]);
                    switch (operator) {
                        case ">":
                            for (int i = 0; i < numbers.size(); i++) {
                                int listNum = numbers.get(i);
                                if (listNum > comparisonNum) {
                                    System.out.print(listNum + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case ">=":
                            for (int i = 0; i < numbers.size(); i++) {
                                int listNum = numbers.get(i);
                                if (listNum >= comparisonNum) {
                                    System.out.print(listNum + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case "<=":
                            for (int i = 0; i < numbers.size(); i++) {
                                int listNum = numbers.get(i);
                                if (listNum <= comparisonNum) {
                                    System.out.print(listNum + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case "<":
                            for (int i = 0; i < numbers.size(); i++) {
                                int listNum = numbers.get(i);
                                if (listNum < comparisonNum) {
                                    System.out.print(listNum + " ");
                                }
                            }
                            System.out.println();
                            break;
                    }
            }

            input = scanner.nextLine();
        }

        // contains
        // print even , odd
        // Get sum
        // Filter
    }
}
