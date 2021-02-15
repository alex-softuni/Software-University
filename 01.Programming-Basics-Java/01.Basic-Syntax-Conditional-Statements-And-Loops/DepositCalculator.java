package FirstSteps.exercises2;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double depositSum = Double.parseDouble(scanner.nextLine());
        int period = Integer.parseInt(scanner.nextLine());
        double percentPerYear = Double.parseDouble(scanner.nextLine()) / 100;
        double totalInterest = depositSum * percentPerYear;
        double interestPerMonth = totalInterest / 12;
//        сума = депозирана сума  + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)
        double totalSum = depositSum + period * ((depositSum * percentPerYear)/12);

        System.out.println(totalSum);
    }
}
