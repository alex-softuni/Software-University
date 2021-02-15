import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rotation = scanner.nextLine();
        int angleRotation = Integer.parseInt(rotation.split("[()]+")[1]) % 360;

        ArrayList<String> list = new ArrayList<>();
        String input = scanner.nextLine();
        int maxLength = input.length();
        while (!input.equals("END")) {
            list.add(input);
            input = scanner.nextLine();
            if (input.length() > maxLength) {
                maxLength = input.length();
            }
        }
        int rows = list.size();
        int cols = maxLength;
        char[][] matrix = new char[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (col < list.get(row).length()) {
                    matrix[row][col] = list.get(row).charAt(col);
                } else {
                    matrix[row][col] = ' ';
                }
            }
        }

        if (angleRotation == 90) {
            for (int col = 0; col < cols; col++) {
                for (int row = rows - 1; row >= 0; row--) {
                    System.out.print(matrix[row][col]);
                }
                System.out.println();
            }
        } else if (angleRotation == 180) {
            for (int row = rows - 1; row >= 0; row--) {
                for (int col = cols - 1; col >= 0; col--) {
                    System.out.print(matrix[row][col]);
                }
                System.out.println();
            }
        } else if (angleRotation == 270) {
            for (int col = cols - 1; col >= 0; col--) {
                for (int row = 0; row < rows; row++) {
                    System.out.print(matrix[row][col]);
                }
                System.out.println();
            }
        } else {
            for (int row = 0; row < rows; row++) {
                for (int col = 0; col < cols; col++) {
                    System.out.print(matrix[row][col]);
                }
                System.out.println();
            }
        }


    }
}
