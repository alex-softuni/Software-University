package Exercises;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        double income = 0;

        if (type.equals("Premiere")){
            income = rows * cols * 12;
        }else if (type.equals("Normal")){
            income = rows * cols * 7.5;
        }else if (type.equals("Discount")){
            income = rows * cols * 5;
        }
        System.out.printf("%.2f",income);
    }
}
