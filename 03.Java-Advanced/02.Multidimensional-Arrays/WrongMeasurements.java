import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WrongMeasurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[rows][];
        for (int row = 0; row < rows; row++) {
            matrix[row] = readArray(scanner);
        }

        ArrayList<int[]> fixInfo = new ArrayList<>();

        int[] changeValue = readArray(scanner);
        int wrongValue = matrix[changeValue[0]][changeValue[1]];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == wrongValue) {
                    int rightValue = calculateRightValue(matrix, row, col, wrongValue);
                    fixInfo.add(new int[]{row, col, rightValue});
                }
            }
        }
        for (int[] info : fixInfo) {
            matrix[info[0]][info[1]] = info[2];
        }
        printMatrix(matrix);
    }
    private static void printMatrix(int[][] firstMatrix) {
        for (int row = 0; row < firstMatrix.length; row++) {
            for (int col = 0; col < firstMatrix[row].length; col++) {
                System.out.print(firstMatrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static int calculateRightValue(int[][] matrix, int row, int col, int wrongValue) {
        int rightValue = 0;
        if (isInBounds(matrix, row, col)
                && matrix[row][col] != wrongValue) {
            rightValue += matrix[row][col];
        }
        if (isInBounds(matrix, row - 1, col)
                && matrix[row - 1][col] != wrongValue) {
            rightValue += matrix[row - 1][col];
        }
        if (isInBounds(matrix, row + 1, col)
                && matrix[row + 1][col] != wrongValue) {
            rightValue += matrix[row + 1][col];
        }
        if (isInBounds(matrix, row, col + 1)
                && matrix[row][col + 1] != wrongValue) {
            rightValue += matrix[row][col + 1];
        }
        if (isInBounds(matrix, row, col - 1)
                && matrix[row][col - 1] != wrongValue) {
            rightValue += matrix[row][col - 1];
        }

        return rightValue;
    }

    private static boolean isInBounds(int[][] matrix, int row, int col) {

        return row >= 0 && row < matrix.length && col >= 0 && col < matrix[row].length;
    }

    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
    }
}
