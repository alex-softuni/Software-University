package MethodsLab;

import java.util.Scanner;

public class E01SignOfInteger {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        printInteger(scanner.nextInt());
    }
    static void printInteger(int num){
        if (num > 0){
            System.out.println("The number " + num + " is positive.");
        } else if (num < 0){
            System.out.println("The number " + num + " is negative.");
        } else {
            System.out.println("The number " + num + " is zero.");
        }
    }
}
