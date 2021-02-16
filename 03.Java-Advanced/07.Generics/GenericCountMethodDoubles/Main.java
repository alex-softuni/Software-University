package GenericCountMethodDoubles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Box<Double> box = new Box<>();

        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            box.add(Double.valueOf(scanner.nextLine()));
        }
        System.out.println(box.countGreaterElements(Double.valueOf(scanner.nextLine())));

    }
}
