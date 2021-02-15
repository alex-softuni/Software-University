package Exercises;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double priceStudio = 0;
        double priceApartment = 0;

        String type = "";

        switch (month) {
            case "May":
            case "October":
                priceStudio = 50 * nights;
                priceApartment = 65 * nights;
                if (nights > 7 && nights < 14) {
                    priceStudio *= 0.95;
                } else if (nights > 14) {
                    priceStudio *= 0.7;
                    priceApartment *= 0.90;
                }
                break;
            case "June":
            case "September":
                priceStudio = 75.20 * nights;
                priceApartment = 68.70 * nights;
                if (nights > 14) {
                    priceStudio *= 0.80;
                    priceApartment *= 0.90;
                }
                break;
            case "July":
            case "August":
                priceStudio = 76 * nights;
                priceApartment = 77 * nights;
                if (nights > 14) {
                    priceApartment *= 0.9;
                }
                break;
        }
        System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv.",priceApartment,priceStudio);
    }
}
