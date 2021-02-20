import java.util.Arrays;
import java.util.Scanner;

public class Bomb {
    private static int startRow = 0;
    private static int startCol = 0;
    private static int bombsCount = 0;
    private static boolean isEndOfRouteReached = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String[] commands = scanner.nextLine().split(",");


        char[][] matrix = new char[n][n];
        for (int row = 0; row < matrix.length; row++) {
            String line = scanner.nextLine().replace(" ", "");
            matrix[row] = line.toCharArray();
            char[] charArray = line.toCharArray();
            for (char c : charArray) {
                if (c == 'B') {
                    bombsCount++;
                }
            }
            if (line.contains("s")) {
                startRow = row;
                startCol = line.indexOf("s");
            }
        }

        int commandCount = commands.length;
        for (int i = 0; i < commands.length; i++) {
            String cmd = commands[i];
            if (cmd.equals("up")) {
                moveSapper(startRow - 1, startCol, matrix);

            } else if (cmd.equals("down")) {
                moveSapper(startRow + 1, startCol, matrix);

            } else if (cmd.equals("left")) {
                moveSapper(startRow, startCol - 1, matrix);

            } else if (cmd.equals("right")) {
                moveSapper(startRow, startCol + 1, matrix);
            }
            commandCount--;
            if (bombsCount <= 0 || isEndOfRouteReached) {
                break;
            }

        }
        StringBuilder sb = new StringBuilder();
        if (bombsCount <= 0) {
            sb.append("Congratulations! You found all bombs!");
        } else if (isEndOfRouteReached) {
            sb.append(String.format("END! %d bombs left on the field", bombsCount));
        } else if (commandCount <= 0) {
            sb.append(String.format("%d bombs left on the field. Sapper position: (%d,%d)", bombsCount, startRow, startCol));
        }

        System.out.println(sb.toString().trim());
    }


    private static boolean moveSapper(int newRow, int newCol, char[][] matrix) {
        if (isOutOfBounds(newRow, newCol, matrix)) {
            return false;
        }
        char symbol = matrix[newRow][newCol];
        if (symbol == '+') {
            startRow = newRow;
            startCol = newCol;
            return true;
        } else if (symbol == 'e') {
            isEndOfRouteReached = true;
            return false;
        } else if (symbol == 'B') {
            System.out.println("You found a bomb!");
            matrix[newRow][newCol] = '+';
            bombsCount--;
        }
        startRow = newRow;
        startCol = newCol;
        return true;
    }


    private static boolean isOutOfBounds(int row, int col, char[][] matrix) {
        return row >= matrix.length || row < 0 || col >= matrix[row].length || col < 0;
    }

}
