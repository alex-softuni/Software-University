import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2x2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = readMatrix(scanner, ", ");

        int maxSum = Integer.MIN_VALUE;
        int maxRow = 0, maxCol = 0;
        for (int row = 0; row < matrix.length - 1; row++) {
            for (int col = 0; col < matrix[row].length - 1; col++) {
                int sum = matrix[row][col] + matrix[row][col + 1] +
                        matrix[row + 1][col] + matrix[row + 1][col + 1];
                if (sum > maxSum) {
                    maxSum = sum;
                    maxRow = row;
                    maxCol = col;
                }
            }
        }
        System.out.println(matrix[maxRow][maxCol] + " " + matrix[maxRow][maxCol + 1]);
        System.out.println(matrix[maxRow + 1][maxCol] + " " + matrix[maxRow + 1][maxCol + 1]);
        System.out.println(maxSum);
    }


    private static int[][] readMatrix(Scanner scanner, String parameters) {
        int[] rowsAndCols = readArray(scanner, parameters);
        int rows = rowsAndCols[0];
        int cols = rowsAndCols[1];
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            matrix[row] = readArray(scanner, parameters);
        }
        return matrix;
    }

    private static int[] readArray(Scanner scanner, String parameters) {
        return Arrays.stream(scanner.nextLine().split(parameters)).mapToInt(Integer::parseInt).toArray();
    }
}
