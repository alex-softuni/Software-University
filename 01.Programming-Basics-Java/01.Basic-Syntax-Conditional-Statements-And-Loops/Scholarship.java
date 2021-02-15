package ConditionalStatements.lab.excercises.Excercises;

import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double income = Double.parseDouble(scanner.nextLine());
        double grades = Double.parseDouble(scanner.nextLine());
        double minSalary = Double.parseDouble(scanner.nextLine());

        double socialScholarship = 0;
        double excellentScholarship = 0;

        if (grades < 5.5 && income > minSalary) {
            System.out.println("You cannot get a scholarship!");
        } else if (grades < 4.5) {
            System.out.println("You cannot get a scholarship!");
        } else if (income < minSalary && grades >= 4.5 && grades < 5.5) {
            socialScholarship = Math.floor(0.35 * minSalary);
            System.out.printf("You get a Social scholarship %.0f BGN", socialScholarship);
        } else if (grades >= 5.5) {
            excellentScholarship = Math.floor(grades * 25);
            System.out.printf("You get a scholarship for excellent results %.0f BGN", excellentScholarship);
        }
    }
}

