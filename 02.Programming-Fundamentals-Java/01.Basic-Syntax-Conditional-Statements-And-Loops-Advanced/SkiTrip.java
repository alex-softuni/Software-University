package Lab;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lengthStay = Integer.parseInt(scanner.nextLine());
        String typeRoom = scanner.nextLine();
        String evaluation = scanner.nextLine();

        double price = 0;
        int nights = lengthStay - 1;
        double roomPrice;
        if (typeRoom.equals("room for one person")) {
            roomPrice = 18.00;
            price = roomPrice * nights;
        } else if (typeRoom.equals("apartment")) {
            roomPrice = 25.00;
            price = roomPrice * nights;
            if (lengthStay < 10) {
                price *= 0.7;
            } else if (lengthStay >= 10 && lengthStay <= 15) {
                price *= 0.65;
            } else if (lengthStay > 15) {
                price *= 0.5;
            }

        } else if (typeRoom.equals("president apartment")) {
            roomPrice = 35.00;
            price = roomPrice * nights;
            if (lengthStay < 10) {
                price *= 0.9;
            } else if (lengthStay >= 10 && lengthStay <= 15) {
                price *= 0.85;
            } else if (lengthStay > 15) {
                price *= 0.8;
            }

        }
        if (evaluation.equals("positive")) {
            price *= 1.25;
        } else if (evaluation.equals("negative")) {
            price *= 0.9;
        }
        System.out.printf("%.2f", price);
    }
}
