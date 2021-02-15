import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[n][n];

        for (int row = 0; row < n ; row++) {
            matrix[row] = readArray(scanner);
        }
        System.out.println(Math.abs(sumPrimaryDiagonal(matrix) - sumSecondaryDiagonal(matrix)));

    }

    private static int sumPrimaryDiagonal(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }

    private static int sumSecondaryDiagonal(int[][] matrix) {
        int sum = 0;
        int temp = matrix.length - 1;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][temp--];
        }
        return sum;
    }

    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    }
}
