package com.company;

import java.util.Scanner;

public class E06CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char firstChar = scanner.nextLine().charAt(0);
        char secondChar = scanner.nextLine().charAt(0);
        char thirdChar = scanner.nextLine().charAt(0);

        String print = "" + firstChar + secondChar + thirdChar;
        System.out.print(print);
    }
}
