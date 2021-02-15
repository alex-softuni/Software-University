package DoWhileExercises;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());

        double cents = Math.floor(money * 100);
        int counter = 0;

        // монети: 2, 1, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01;
        // стотинки: 200; 100; 50; 20; 10; 5; 2; 1;

        while(cents != 0){
            if (cents >= 200){
                counter++;
                cents -= 200;
            } else if (cents >= 100){
                counter++;
                cents -= 100;
            } else if (cents >= 50){
                counter++;
                cents -= 50;
            }else if (cents >=20){
                counter++;
                cents -= 20;
            }else if (cents >=10){
                counter++;
                cents -= 10;
            }else if (cents >= 5){
                counter++;
                cents -= 5;
            }else if (cents >= 2){
                counter++;
                cents -= 2;
            }else if (cents >= 1){
                counter++;
                cents -= 1;
            }
        }
        System.out.println(counter);



    }
}
