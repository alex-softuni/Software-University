package MethodsLab;

import java.util.Scanner;

public class E06CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        getRectangleArea(width, length);
    }

    static void getRectangleArea(int a, int b) {
        System.out.println(a * b);
    }
}
