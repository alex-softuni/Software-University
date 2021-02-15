import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = new ArrayList<>();
        String line = scanner.nextLine();
        String[] numbersAsStrings = line.split(" ");
        for (int i = 0; i < numbersAsStrings.length; i++) {
            wagons.add(Integer.parseInt(numbersAsStrings[i]));
        }

        int maxCapacity = Integer.parseInt(scanner.nextLine());


        String input = scanner.nextLine();
        String[] command = input.split(" ");
        while (!command[0].equals("end")) {
            if (command[0].equals("Add")) {
                wagons.add(Integer.parseInt(command[1]));
            } else {
                for (int i = 0; i < wagons.size(); i++) {
                    int sum = Integer.parseInt(command[0]) + wagons.get(i);
                    if (sum <= maxCapacity) {
                        wagons.set(i, sum);
                        break;
                    }
                }
            }
            command = scanner.nextLine().split(" ");
        }

        for (Integer wagon : wagons) {
            System.out.print(wagon + " ");
        }

    }
}
