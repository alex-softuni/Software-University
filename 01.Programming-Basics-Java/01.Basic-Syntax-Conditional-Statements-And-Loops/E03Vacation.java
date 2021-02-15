package Exercises;

import java.util.Scanner;

public class E03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String day = scanner.nextLine();

        double totalPrice = 0;

        switch (typeOfGroup) {
            case "Students":
                switch (day) {
                    case "Friday":
                        totalPrice += 8.45 * people;
                        break;
                    case "Saturday":
                        totalPrice += 9.80 * people;
                        break;
                    case "Sunday":
                        totalPrice += 10.46 * people;
                        break;
                }
                if (people >= 30) {
                    totalPrice *= 0.85;
                }
                break;
            case "Business":
                if (people >= 100) {
                    people -= 10;
                }
                switch (day) {
                    case "Friday":
                        totalPrice += 10.90 * people;
                        break;
                    case "Saturday":
                        totalPrice += 15.60 * people;
                        break;
                    case "Sunday":
                        totalPrice += 16 * people;
                        break;
                }
                break;
            case "Regular":
                switch (day) {
                    case "Friday":
                        totalPrice += 15 * people;
                        break;
                    case "Saturday":
                        totalPrice += 20 * people;
                        break;
                    case "Sunday":
                        totalPrice += 22.50 * people;
                        break;
                    }
                    if (people >= 10 && people <= 20){
                        totalPrice *= 0.95;
                }
                    break;
        }
        System.out.printf("Total price: %.2f",totalPrice);
    }
}
