import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");

        int n = Integer.parseInt(input[0]);
        String type = input[1];

        int[][] matrix = new int[n][n];

        fillMatrix(matrix, type);
        printMatrix(matrix);
    }

    private static int[][] fillMatrix(int[][] matrix, String type) {
        if (type.equals("A")) {
            fillPatternA(matrix);
        } else if (type.equals("B")) {
            fillPatternB(matrix);
        }

        return matrix;
    }

    private static void fillPatternA(int[][] matrix) {
        int number = 1;
        for (int col = 0; col < matrix.length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                matrix[row][col] = number++;
            }
        }

    }

    private static void fillPatternB(int[][] matrix) {
        int number = 1;
        for (int col = 0; col < matrix.length; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < matrix.length; row++) {
                    matrix[row][col] = number++;
                }
            } else {
                for (int row = matrix.length - 1; row >= 0; row--) {
                    matrix[row][col] = number++;
                }
            }
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
