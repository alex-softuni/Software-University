package Exercises;

import java.util.Scanner;

public class E09PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int countStudents = Integer.parseInt(scanner.nextLine());
        double sabrePrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        double freeBelts = 0;
        for (int i = 1; i <= countStudents; i++) {
            if (i % 6 == 0 && i != 3) {
                freeBelts++;
            }
        }

        sabrePrice = sabrePrice * (Math.ceil(countStudents * 1.10));
        robePrice = robePrice * countStudents;
        beltPrice = beltPrice * (countStudents - freeBelts);

        double sum = sabrePrice + robePrice + beltPrice;

        if (budget >= sum){
            System.out.printf("The money is enough - it would cost %.2flv.",sum);
        } else {
            System.out.printf("Ivan Cho will need %.2flv more.",Math.abs(sum - budget));
        }
    }
}
