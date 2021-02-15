package DoWhileExercises;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        int cakePieces = width * length;

        String input = scanner.nextLine();
        while (!input.equals("STOP")) {
            int piecesTaken = Integer.parseInt(input);
            cakePieces -= piecesTaken;
            if (cakePieces <= 0) {
                break;
            }


            input = scanner.nextLine();
        }
        if (cakePieces <= 0){
            System.out.printf("No more cake left! You need %d pieces more.",Math.abs(cakePieces));
        }else {
            System.out.printf("%d pieces are left.",cakePieces);
        }

    }
}
