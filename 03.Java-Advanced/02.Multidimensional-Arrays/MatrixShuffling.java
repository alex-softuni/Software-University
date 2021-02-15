import java.util.Arrays;
import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] matrix = readMatrix(scanner);

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            String[] tokens = input.split("\\s+");

            // Indexes of coordinates !!!
            if (!isValid(tokens)) {
                System.out.println("Invalid input!");
            } else {
                int extantRow = Integer.parseInt(tokens[1]);
                int extantCol = Integer.parseInt(tokens[2]);
                int swapRow = Integer.parseInt(tokens[3]);
                int swapCol = Integer.parseInt(tokens[4]);

                if (isInBounds(extantRow, extantCol, matrix)
                        && isInBounds(swapRow, swapCol, matrix)) {
                    swapCoordinates(matrix, extantRow, extantCol, swapRow, swapCol);
                    printMatrix(matrix);
                } else {
                    System.out.println("Invalid input!");
                }
            }

            input = scanner.nextLine();
        }

    }

    private static boolean isDigit(int extantRow, int extantCol, int swapRow, int swapCol) {
        if (Character.isDigit(extantRow) && Character.isDigit(extantCol) && Character.isDigit(swapRow) && Character.isDigit(swapCol)) {
            return true;
        }
        return false;
    }

    private static boolean isValid(String[] tokens) {
        if (tokens[0].equals("swap") && tokens.length == 5) {
            return true;
        }
        return false;
    }

    private static boolean isInBounds(int row, int col, String[][] matrix) {
        return row >= 0 && row < matrix.length && col >= 0 && col < matrix[row].length;

    }

    private static void swapCoordinates(String[][] matrix, int extantRow, int extantCol, int swapRow, int swapCol) {
        String temp = matrix[extantRow][extantCol];
        matrix[extantRow][extantCol] = matrix[swapRow][swapCol];
        matrix[swapRow][swapCol] = temp;
    }


    private static void printMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static String[][] readMatrix(Scanner scanner) {
        int[] matrixInfo = readArray(scanner);
        int rows = matrixInfo[0];
        int cols = matrixInfo[1];

        String[][] matrix = new String[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] array = readStringArray(scanner);
            matrix[row] = array;
        }

        return matrix;
    }

    public static String[] readStringArray(Scanner scanner) {
        return scanner.nextLine().split("\\s+");
    }

    public static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
    }
}
