package Lab;


import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String city = scanner.nextLine();
        int amount = Integer.parseInt(scanner.nextLine());
        double sum = 0;

        if (city.equals("Sofia")) {
            if (product.equals("coffee")) {
                sum = amount * 0.50;
            } else if (product.equals("water")) {
                sum = amount * 0.80;
            } else if (product.equals("beer")) {
                sum = amount * 1.2 ;
            } else if (product.equals("sweets")) {
                sum = amount * 1.45;
            } else if (product.equals("peanuts")) {
                sum = amount * 1.60;
            }
        } else if (city.equals("Plovdiv")) {
            if (product.equals("coffee")) {
                sum = amount * 0.40;
            } else if (product.equals("water")) {
                sum = amount * 0.70;
            } else if (product.equals("beer")) {
                sum = amount * 1.15;
            } else if (product.equals("sweets")) {
                sum = amount * 1.30;
            } else if (product.equals("peanuts")) {
                sum = amount * 1.50;
            }
        } else if (city.equals("Varna")) {
            if (product.equals("coffee")) {
                sum = amount * 0.45;
            } else if (product.equals("water")) {
                sum = amount * 0.70;
            } else if (product.equals("beer")) {
                sum = amount * 1.10;
            } else if (product.equals("sweets")) {
                sum = amount * 1.35;
            } else if (product.equals("peanuts")) {
                sum = amount * 1.55;
            }

        }
        System.out.println(sum);
    }
}


