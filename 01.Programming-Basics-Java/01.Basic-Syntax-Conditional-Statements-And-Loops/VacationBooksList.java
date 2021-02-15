package FirstSteps.exercises2;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pagesNumber = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int hoursNeeded = (pagesNumber / pagesPerHour) / days ;
        System.out.println(hoursNeeded);

    }
}
