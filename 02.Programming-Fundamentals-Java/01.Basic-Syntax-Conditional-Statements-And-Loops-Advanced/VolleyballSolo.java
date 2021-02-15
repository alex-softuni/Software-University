package Exercises;

import java.util.Scanner;

public class VolleyballSolo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String yearType = scanner.nextLine();
        int vacationDays = Integer.parseInt(scanner.nextLine());
        int homeWeekends = Integer.parseInt(scanner.nextLine());

        double playDays = (48 - homeWeekends) * 3.0 / 4
                + vacationDays * 2.0 / 3
                + homeWeekends;

        if (yearType.equals("leap")) {
            playDays *= 1.15;
        }
        System.out.printf("%.0f", Math.floor(playDays));
    }
}
