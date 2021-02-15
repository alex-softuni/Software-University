package DoWhileExercises;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stepsReached = 0;
        String input = scanner.nextLine();
        while (!input.equals("Going home")) {
            int steps = Integer.parseInt(input);
            stepsReached += steps;
            if (stepsReached >= 10000) {
                break;
            }
            input = scanner.nextLine();
        }
        if (input.equals("Going home")){
            int walkHome = Integer.parseInt(scanner.nextLine());
            stepsReached += walkHome;
        }

        if (stepsReached >= 10000) {
            System.out.println("Goal reached! Good job!");
            if (stepsReached > 10000) {
                System.out.printf("%d steps over the goal!", Math.abs(stepsReached - 10000));
            }
        } else {
            System.out.printf("%d more steps to reach goal.", Math.abs(stepsReached - 10000));
        }
    }

}
