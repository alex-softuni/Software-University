package Lab;

import java.util.Scanner;

public class MarketComission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());
        double commission = 0;


        switch (city) {
            case "Sofia":
                if (sales <= 500) {
                    commission = Math.abs(0.95 * sales - sales);
                } else if (sales <= 1000 && sales > 500) {
                    commission = Math.abs(0.93 * sales - sales);
                } else if (sales <= 10000 && sales > 1000) {
                    commission = Math.abs(0.92 * sales - sales);
                } else if (sales > 10000) {
                    commission = Math.abs(0.88 * sales - sales);
                } else {
                    System.out.println("error");
                }
                if (sales >= 0) {
                    System.out.printf("%.2f", commission);
                } else {
                    System.out.println("error");
                }
                break;
            case "Varna":
                if (sales <= 500) {
                    commission = Math.abs(0.955 * sales - sales);
                } else if (sales <= 1000 && sales > 500) {
                    commission = Math.abs(0.925 * sales - sales);
                } else if (sales <= 10000 && sales > 1000) {
                    commission = Math.abs(0.90 * sales - sales);
                } else if (sales > 10000) {
                    commission = Math.abs(0.87 * sales - sales);
                } else {
                    System.out.println("error");
                }
                if (sales >= 0) {
                    System.out.printf("%.2f", commission);
                } else {
                    System.out.println("error");
                }
                break;
            case "Plovdiv":
                if (sales <= 500) {
                    commission = Math.abs(0.945 * sales - sales);
                } else if (sales <= 1000 && sales > 500) {
                    commission = Math.abs(0.92 * sales - sales);
                } else if (sales <= 10000 && sales > 1000) {
                    commission = Math.abs(0.88 * sales - sales);
                } else if (sales > 10000) {
                    commission = Math.abs(0.855 * sales - sales);
                } else {
                    System.out.println("error");
                }
                if (sales >= 0) {
                    System.out.printf("%.2f", commission);
                } else {
                    System.out.println("error");
                }
                break;
            default:
                System.out.println("error");

        }
    }
}
