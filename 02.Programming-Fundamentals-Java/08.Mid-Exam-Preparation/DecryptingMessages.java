package com.company;

import java.util.Scanner;

public class DecryptingMessages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        String decryptedMsg = "";
        for (int i = 0; i < n; i++) {
            String charAsStrings = scanner.nextLine();
            char ch = charAsStrings.charAt(0);
            int asciiValue = ch + key;
            decryptedMsg += (char) asciiValue;
        }
        System.out.println(decryptedMsg);

    }
}
