package Lab;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0;

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                if (product.equals("banana")) {
                    price = quantity * 2.50;
                    System.out.printf("%.2f", price);
                } else if (product.equals("apple")) {
                    price = quantity * 1.20;
                    System.out.printf("%.2f", price);
                } else if (product.equals("orange")) {
                    price = quantity * 0.85;
                    System.out.printf("%.2f", price);
                } else if (product.equals("grapefruit")) {
                    price = quantity * 1.45;
                    System.out.printf("%.2f", price);
                } else if (product.equals("kiwi")) {
                    price = quantity * 2.70;
                    System.out.printf("%.2f", price);
                } else if (product.equals("pineapple")) {
                    price = quantity * 5.50;
                    System.out.printf("%.2f", price);
                } else if (product.equals("grapes")) {
                    price = quantity * 3.85;
                    System.out.printf("%.2f", price);
                }else{
                    System.out.println("error");
                }
                break;
            case "Saturday":
            case "Sunday":
                if (product.equals("banana")) {
                    price = quantity * 2.70;
                    System.out.printf("%.2f", price);
                } else if (product.equals("apple")) {
                    price = quantity * 1.25;
                    System.out.printf("%.2f", price);
                } else if (product.equals("orange")) {
                    price = quantity * 0.90;
                    System.out.printf("%.2f", price);
                } else if (product.equals("grapefruit")) {
                    price = quantity * 1.60;
                    System.out.printf("%.2f", price);
                } else if (product.equals("kiwi")) {
                    price = quantity * 3.00;
                    System.out.printf("%.2f", price);
                } else if (product.equals("pineapple")) {
                    price = quantity * 5.60;
                    System.out.printf("%.2f", price);
                } else if (product.equals("grapes")) {
                    price = quantity * 4.20;
                    System.out.printf("%.2f", price);
                }else{
                    System.out.println("error");
                }
                break;
            default:
                System.out.println("error");
        }
    }
}








