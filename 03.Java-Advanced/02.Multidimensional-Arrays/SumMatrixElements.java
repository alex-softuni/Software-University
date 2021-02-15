import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = readMatrix(scanner, ", ");

        int sum = getMatrixSum(matrix);
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
        System.out.println(sum);
    }

    private static int getMatrixSum(int[][] matrix) {
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                sum += matrix[row][col];
            }
        }
        return sum;
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
