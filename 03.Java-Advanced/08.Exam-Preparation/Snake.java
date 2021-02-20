import java.util.Arrays;
import java.util.Scanner;

public class Snake {
    static int startRow = 0;
    static int startCol = 0;
    static int foodEaten = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        char[][] matrix = new char[n][n];

        for (int row = 0; row < matrix.length; row++) {
            String line = scanner.nextLine();
            matrix[row] = line.toCharArray();
            if (line.contains("S")) {
                startRow = row;
                startCol = line.indexOf("S");
            }
        }

        while (foodEaten < 10) {
            String command = scanner.nextLine();

            if (command.equals("up")) {
                if (isOutOfBounds(startRow - 1, startCol, matrix)) {
                    matrix[startRow][startCol] = '.';
                    break;
                }
                move(startRow - 1, startCol, matrix);
            } else if (command.equals("down")) {
                if (isOutOfBounds(startRow + 1, startCol, matrix)) {
                    matrix[startRow][startCol] = '.';
                    break;
                }
                move(startRow + 1, startCol, matrix);
            } else if (command.equals("right")) {
                if (isOutOfBounds(startRow, startCol + 1, matrix)) {
                    matrix[startRow][startCol] = '.';
                    break;
                }
                move(startRow, startCol + 1, matrix);
            } else if (command.equals("left")) {
                if (isOutOfBounds(startRow, startCol - 1, matrix)) {
                    matrix[startRow][startCol] = '.';
                    break;
                }
                move(startRow, startCol - 1, matrix);
            }

        }
        String message = foodEaten < 10
                ? "Game over!"
                : "You won! You fed the snake.";
        System.out.println(message);
        System.out.println("Food eaten: " + foodEaten);
        printMatrix(matrix);
    }

    private static void move(int newRow, int newCol, char[][] matrix) {
        matrix[startRow][startCol] = '.';
        char symbol = matrix[newRow][newCol];

        boolean isSnakeSwitchingBurrows = false;
        if (symbol == '-') {
            matrix[newRow][newCol] = 'S';
        } else if (symbol == '*') {
            matrix[newRow][newCol] = 'S';
            foodEaten++;
        } else if (symbol == 'B') {
            matrix[newRow][newCol] = '.';
            for (int r = 0; r < matrix.length; r++) {
                for (int c = 0; c < matrix[r].length; c++) {
                    if (symbol == matrix[r][c]) {
                        startRow = r;
                        startCol = c;
                        break;
                    }
                }
            }
            isSnakeSwitchingBurrows = true;
        }
        if (!isSnakeSwitchingBurrows) {
            startRow = newRow;
            startCol = newCol;
        }
    }


    private static boolean isOutOfBounds(int row, int col, char[][] matrix) {
        return row >= matrix.length || row < 0 || col >= matrix.length || col < 0;
    }

    private static void printMatrix(char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }
}
