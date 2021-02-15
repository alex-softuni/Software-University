package DoWhileLab;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double sum = 0;
        while (!input.equals("NoMoreMoney")){
            double currentNum = Double.parseDouble(input);
            if (currentNum <= 0){
                System.out.println("Invalid operation!");
                break;
            }
            if (input.equals("Stop")){
                break;
            }
            sum += currentNum;
            System.out.printf("Increase: %.2f%n",currentNum);
            input=scanner.nextLine();
        }
        System.out.printf("Total: %.2f%n",sum);
    }
}
