import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] commands = input.split("\\s+");
            switch (commands[0]) {
                case "Delete":
                    int deletedNum = Integer.parseInt(commands[1]);
                    while (numbers.contains(deletedNum)) {
                        numbers.remove((Integer) deletedNum);
                    }
                    break;
                case "Insert":
                    int element = Integer.parseInt(commands[1]);
                    int index = Integer.parseInt(commands[2]);
                    if (index < numbers.size()) {
                        numbers.add(index,element);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

    }
}
