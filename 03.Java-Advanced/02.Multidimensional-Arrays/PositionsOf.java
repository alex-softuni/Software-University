import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = readMatrix(scanner);
        int findNumber = Integer.parseInt(scanner.nextLine());
        boolean isFound = false;
        while (true) {
            for (int row = 0; row < matrix.length; row++) {
                for (int col = 0; col < matrix[row].length; col++) {
                    int currentNumber = matrix[row][col];
                    if (currentNumber == findNumber) {
                        System.out.println(row + " " + col);
                        isFound = true;
                    }
                }
            }
            if (!isFound) {
                break;
            } else {
                return;
            }
        }
        System.out.println("not found");

    }

    private static int[][] readMatrix(Scanner scanner) {
        int[] rowsAndCols = readArray(scanner);
        int rows = rowsAndCols[0];
        int cols = rowsAndCols[1];
        int[][] matrix = new int[rows][cols];
        // for each row readArray and save it in current iteration
        for (int row = 0; row < rows; row++) {
            matrix[row] = readArray(scanner);
        }
        return matrix;
    }

    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
    }
}
