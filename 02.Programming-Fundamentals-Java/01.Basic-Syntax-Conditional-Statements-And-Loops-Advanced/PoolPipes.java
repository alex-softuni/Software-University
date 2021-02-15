package com;

import java.util.Scanner;

public class PoolPipes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int poolVolume = Integer.parseInt(scanner.nextLine());
        int firstPipe = Integer.parseInt(scanner.nextLine());
        int secondPipe = Integer.parseInt(scanner.nextLine());

        double hours = Double.parseDouble(scanner.nextLine());

        double firstPipeSum = firstPipe * hours;
        double secondPipeSum = secondPipe * hours;

        double totalSum = firstPipeSum + secondPipeSum;

        double pipesSum = firstPipeSum + secondPipeSum;
        double firstPipePercentage = (firstPipeSum * 100) / pipesSum;
        double secondPipePercentage = (secondPipeSum * 100) / pipesSum;
        double totalSumPercentage = (totalSum * 100) / poolVolume;

        if (totalSum <= poolVolume) {
            System.out.printf("The pool is %.2f%% full. " +
                    "Pipe 1: %.2f%%. Pipe 2: %.2f%%.",totalSumPercentage,firstPipePercentage,secondPipePercentage);
        }
        if (totalSum > poolVolume) {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.",hours,Math.abs(totalSum - poolVolume));
        }

    }
}
