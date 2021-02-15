package ForLoopExercises;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());



        for (int i = 1; i <= tabs; i++) {
            String nameSite = scanner.nextLine();
            if (nameSite.equals("Facebook")){
                salary -= 150;
            }
            if (nameSite.equals("Instagram")){
                salary -= 100;
            }
            if (nameSite.equals("Reddit")){
                salary -= 50;
            }

        }
        double diff = salary;
        if (salary <= 0){
            System.out.println("You have lost your salary.");
        } else {
            System.out.printf("%.0f",diff);
        }


    }
}
