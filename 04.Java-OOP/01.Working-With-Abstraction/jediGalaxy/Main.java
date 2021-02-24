package jediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = parseArray(scanner.nextLine());
        int rows = dimensions[0];
        int cols = dimensions[1];


        int[][] matrix = new int[rows][cols];
        fillMatrix(rows, cols, matrix);

        String command = scanner.nextLine();
        long sum = getStarsSum(scanner, matrix, command);
        System.out.println(sum);


    }

    private static long getStarsSum(Scanner scanner, int[][] matrix, String command) {
        long sum = 0;
        while (!command.equals("Let the Force be with you")) {
            int[] ivoS = parseArray(command);
            int[] evil = parseArray(scanner.nextLine());

            moveEvil(matrix, evil);

            int ivoRow = ivoS[0];
            int ivoCol = ivoS[1];

            sum = movePlayer(matrix, sum, ivoRow, ivoCol);

            command = scanner.nextLine();
        }
        return sum;
    }

    private static long movePlayer(int[][] matrix, long sum, int ivoRow, int ivoCol) {
        while (ivoRow >= 0 && ivoCol < matrix[1].length) {
            if (isInBounds(matrix, ivoRow, ivoCol)) {
                sum += matrix[ivoRow][ivoCol];
            }

            ivoCol++;
            ivoRow--;
        }
        return sum;
    }

    private static void moveEvil(int[][] matrix, int[] evil) {
        int evilRow = evil[0];
        int evilCol = evil[1];

        while (evilRow >= 0 && evilCol >= 0) {
            if (isInBounds(matrix, evilRow, evilCol)) {
                matrix[evilRow][evilCol] = 0;
            }
            evilRow--;
            evilCol--;
        }
    }

    private static int[] parseArray(String input) {
        return Arrays.stream(input.split("\\s+")).mapToInt(Integer::parseInt).toArray();
    }

    private static void fillMatrix(int rows, int cols, int[][] matrix) {
        int value = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = value++;
            }
        }
    }

    private static boolean isInBounds(int[][] matrix, int row, int col) {
        return row >= 0 && row < matrix.length && col >= 0 && col < matrix[0].length;
    }
}
