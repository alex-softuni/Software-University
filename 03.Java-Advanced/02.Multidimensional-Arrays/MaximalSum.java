import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[][] matrix = readMatrix(scanner);

        int bestSum = Integer.MIN_VALUE;
        int[] bestVector = new int[2];

        for (int row = 0; row < matrix.length - 2; row++) {
            for (int col = 0; col < matrix[row].length - 2; col++) {
                int[] start = new int[]{row, col};
                if (findSum(start, matrix) > bestSum) {
                    bestSum = findSum(start, matrix);
                    bestVector = start;
                }
            }
        }
        System.out.println(String.format("Sum = %d",bestSum));
        printMatrix(bestVector, matrix);
    }

    private static int findSum(int[] vector, int[][] matrix) {
        int sum = 0;
        for (int row = vector[0]; row <= vector[0] + 2; row++) {
            for (int col = vector[1]; col <= vector[1] + 2; col++) {
                sum += matrix[row][col];
            }
        }
        return sum;
    }

    private static void printMatrix(int[] vector, int[][] matrix) {
        for (int row = vector[0]; row <= vector[0] + 2; row++) {
            for (int col = vector[1]; col <= vector[1] + 2; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] readMatrix(Scanner scanner) {
        int[] matrixInfo = readArray(scanner);
        int rows = matrixInfo[0];
        int cols = matrixInfo[1];

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            int[] array = readArray(scanner);
            matrix[row] = array;
        }

        return matrix;
    }

    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
    }
}
