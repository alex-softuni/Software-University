package DoWhileLab;

import java.util.Scanner;

public class GraduationPt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int counter = 1;
        int excluded = 0;
        double sum = 0;

        boolean exclude = false;

        while (counter <= 12) {
            double grade = Double.parseDouble(scanner.nextLine());
            sum = sum + grade;

            if (grade >= 4.00) {
                counter++;
                continue;
            }
            if (grade < 4.00) {
                excluded++;
                if (excluded >= 2) {
                    break;
                }
                continue;
            }

        }
        double average = sum / 12;
        if (excluded >= 2){
            System.out.printf("%s has been excluded at %d grade",name,counter);
        }else {
            System.out.printf("%s graduated. Average grade: %.2f",name,average);
        }
    }
}

