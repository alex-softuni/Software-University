package NestedLoopsExercises;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int number = 1;
        boolean flag = false;
        for (int i = 1; i <= n; i++) {
            for (int rows = 1; rows <= i; rows++) {
                System.out.print(number + " ");
                if (number == n) {
                    flag = true;
                    break;
                }
                number++;


            }
            if (flag){
                break;
            }
            System.out.println();
        }


    }
}
