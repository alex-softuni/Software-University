package HotelReservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split("\\s+");

        double pricePerDay = Double.parseDouble(line[0]);
        int numberOfDays = Integer.parseInt(line[1]);
        Season season = Season.valueOf(line[2]);
        Discount discount = Discount.valueOf(line[3]);

        System.out.printf("%.2f%n", PriceCalculator.CalculatePrice(pricePerDay, numberOfDays, season, discount));
    }
}
