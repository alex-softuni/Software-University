import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrixSquare = new int[n][n];

        for (int row = 0; row < n ; row++) {
            matrixSquare[row] = readArray(scanner);
        }

        int row = 0, col = 0;
        while (row < n && col < n){
            System.out.print(matrixSquare[row++][col++] + " ");
        }
        System.out.println();


        row = n - 1;
        col = 0;

        while (row < n && col < n){
            System.out.print(matrixSquare[row--][col++] + " ");
        }
    }

    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    }
}
