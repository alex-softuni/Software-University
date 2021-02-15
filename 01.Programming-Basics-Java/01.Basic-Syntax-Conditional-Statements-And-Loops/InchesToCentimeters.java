package FirstSteps.exercises;

import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Инчове към сантиметри
        double inches = 2.54;
        double centimeters = Double.parseDouble(scanner.nextLine());
        double result = centimeters * inches;
        System.out.println(result);


    }
}
