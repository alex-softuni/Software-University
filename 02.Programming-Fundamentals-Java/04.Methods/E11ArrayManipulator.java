

import java.util.Arrays;
import java.util.Scanner;

public class E11ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();


        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] inputArray = input.split(" ");
            String command = inputArray[0];

            switch (command) {
                case "exchange":
                    int index = Integer.parseInt(inputArray[1]);
                    if (index >= 0 && index < array.length){
                        // method
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "max":
                    // method
                    break;
                case "min":
                    // method
                    break;
                case "first":
                    // method
                    break;
                case "last":
                    // method
                    break;
            }

            input = scanner.nextLine();
        }
    }
}
