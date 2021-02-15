package ConditionalStatements.lab.excercises;

import java.util.Scanner;

public class SpainTaxes { // Регионална и държавна такса според приходите в Испания .
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salaryPerYear = Double.parseDouble(scanner.nextLine());
        if (salaryPerYear <= 12450) {
            double totalTax = salaryPerYear * 0.19;
            System.out.printf("%.2f", totalTax);
        }else if (salaryPerYear <= 20200) {
            double totalTax = salaryPerYear * 0.24;
            System.out.printf("%.2f",totalTax);
        }else if (salaryPerYear <= 60000){
            double totalTax = salaryPerYear * 0.37;
            System.out.printf("%.2f",totalTax);
        }else if(salaryPerYear > 60000){
            double totalTax = salaryPerYear * 0.45;
            System.out.printf("%.2f",totalTax);
        }else if (salaryPerYear >= 35200){
            double totalTax = salaryPerYear * 0.30;
            System.out.printf("%.2f",totalTax);
        }
    }
}
