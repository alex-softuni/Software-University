package Exercises;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> fixedEmails = new LinkedHashMap<>();

        String currentName = "";
        int count = 0;
        String input = scanner.nextLine();
        while (!input.equals("stop")) {
            String name = input;
            String email = input;
            if (count % 2 == 0) {
                fixedEmails.putIfAbsent(name, "");
                currentName = name;
            } else {
                if (isValid(email)) {
                    fixedEmails.put(currentName, email);
                } else {
                    fixedEmails.remove(currentName);
                }
            }
            count++;
            input = scanner.nextLine();
        }
        System.out.println();
        printEntry(fixedEmails);
    }

    private static void printEntry(Map<String, String> fixedEmails) {
        fixedEmails.forEach((key, value) -> System.out.println(String.format("%s -> %s", key, value)));
    }

    private static boolean isValid(String email) {
        email = email.toLowerCase(Locale.ROOT);
        if (email.endsWith("us") || email.endsWith("uk") || email.endsWith("com")) {
            return false;
        }
        return true;
    }
}
