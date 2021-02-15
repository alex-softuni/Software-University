package MethodsLab;

import java.util.Scanner;

public class E07RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatString(str,count));
    }

    static String repeatString(String str, int count){
        String result = "";

        for (int i = 0; i < count; i++) {
            result += str;
        }
        return result;
    }
}
