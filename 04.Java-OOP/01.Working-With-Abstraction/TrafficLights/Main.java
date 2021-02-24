package TrafficLights;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArray = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            switchLights(inputArray);
            printLights(inputArray);
        }

    }

    private static void printLights(String[] inputArray) {
        System.out.print(String.join(" ", inputArray));
        System.out.println();
    }

    private static void switchLights(String[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            switch (inputArray[i]) {
                case "GREEN":
                    inputArray[i] = "YELLOW";
                    break;
                case "YELLOW":
                    inputArray[i] = "RED";
                    break;
                case "RED":
                    inputArray[i] = "GREEN";
                    break;
            }
        }


    }
}
