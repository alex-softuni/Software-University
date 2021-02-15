package Exercises;

import java.util.Scanner;

public class E10RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());
        double price = 0;

        int headsetCounter = 0;
        int mouseCounter = 0;
        int keyboardCounter = 0;


        boolean headsetBroken = false;
        boolean mouseBroken = false;

        for (int i = 1; i <= lostGamesCount; i++) {
            headsetCounter++;
            mouseCounter++;

            if (headsetCounter == 2) {
                headsetBroken = true;
                headsetCounter = 0;
                price += headsetPrice;
            } else {
                headsetBroken = false;
            }
            if (mouseCounter == 3){
                mouseBroken = true;
                mouseCounter = 0;
                price += mousePrice;
            } else {
                mouseBroken = false;
            }
            if (headsetBroken && mouseBroken){
                headsetBroken = false;
                mouseBroken = false;
                keyboardCounter++;
                price += keyboardPrice;
            }
            if (keyboardCounter == 2){
                keyboardCounter = 0;
                price += displayPrice;
            }
        }


        System.out.printf("Rage expenses: %.2f lv.", price);
    }
}