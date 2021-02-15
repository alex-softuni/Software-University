package com;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distance = Integer.parseInt(scanner.nextLine());
        String time = scanner.nextLine();
double price = 0;
        switch (time) {
            case "day":
                if (distance < 20){
                    price = distance * 0.79 + 0.70;

                } else if (distance >= 20 && distance < 100){
                    price = distance * 0.09;

                } else if (distance >= 100){
                    price = distance * 0.06;
                }
                break;
            case "night":
                if (distance < 20){
                    price = distance * 0.90 + 0.70;

                } else if (distance >= 20 && distance < 100){
                    price = distance * 0.09;

                } else if (distance >= 100){
                    price = distance * 0.06;
                }
                break;
        }
        System.out.printf("%.2f",price);
    }
}
