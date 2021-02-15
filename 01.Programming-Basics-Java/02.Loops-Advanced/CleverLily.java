package ForLoopLab;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double priceWashMachine = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        int countOdd = 0;
        int moneyPerY= 0;
        int moneyEven = 0;
        for (int i = 1; i <= age; i++) {
            if (i % 2 != 0) {
                countOdd++;
            } else {
                moneyPerY = moneyPerY + 10;
                moneyEven = moneyPerY + moneyEven - 1;
            }
        }
        double sumToys = toyPrice * countOdd;
        double totalSum = sumToys + moneyEven;
        double diff = Math.abs(totalSum - priceWashMachine);
        if (totalSum >= priceWashMachine){
            System.out.printf("Yes! %.2f",diff);
        }else {
            System.out.printf("No! %.2f",diff);
        }
    }
}
