package FirstSteps.exercises2;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        double percent = Double.parseDouble(scanner.nextLine());
        double capacity = (length * width * height) * 0.001;
        double percentage = percent / 100 ;

        double totalLitersNeeded = capacity * (1-percentage);
        System.out.printf("%.2f",totalLitersNeeded);









    }
}
