package FirstSteps.exercises;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       double area = Double.parseDouble(scanner.nextLine());
       double PriceArea = area * 7.61;
       double discount = 0.18 * PriceArea;
       double finalPrice = PriceArea - discount;

       System.out.printf("The final price is: %.2f lv.%n",finalPrice);
       System.out.printf("The discount is: %.2f lv.%n",discount);

    }
}
