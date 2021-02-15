package DoWhileLab;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int volume = width * length * height;
        int sumBoxes = 0;

        boolean noMoreSpace = false;

        String input = scanner.nextLine();
        while (!input.equals("Done")) {
            int currentNum = Integer.parseInt(input);
            sumBoxes += currentNum;

            if (sumBoxes > volume) {
                noMoreSpace = true;
                break;
            }
            input = scanner.nextLine();
        }
        if (noMoreSpace == true) {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(sumBoxes - volume));
        } else {
            System.out.printf("%d Cubic meters left.",Math.abs(sumBoxes - volume));
        }
    }
}
