package MethodsLab;

import java.util.Scanner;

public class E03PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <= input; i++) {
            printLine(1, i);
        }
        for (int i = input - 1; i >= 1 ; i--) {
            printLine(1, i);
        }
    }

    static void printLine(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

    }
}
