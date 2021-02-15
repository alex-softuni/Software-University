package Lab;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> parking = new LinkedHashSet<>();

        String input = scanner.nextLine();
        while (!input.equals("END")) {
            String[] data = input.split(", ");
            String direction = data[0];
            String registration = data[1];

            if (direction.equals("IN")) {
                parking.add(registration);
            } else if (direction.equals("OUT")) {
                parking.remove(registration);
            }

            input = scanner.nextLine();
        }
        if (!parking.isEmpty()) {
            parking.forEach(System.out::println);
        } else {
            System.out.println("Parking Lot is Empty");
        }
    }
}
