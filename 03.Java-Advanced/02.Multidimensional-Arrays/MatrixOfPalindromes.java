import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        char[][] matrix = new char[rows][cols];

        char a = 'a';
        char b = 'b';
int counter = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (counter == 0) {
                    --b;
                    counter++;
                }
                System.out.print(a);
                System.out.print(b);
                System.out.print(a);
                System.out.print(" ");

                b++;

            }
            System.out.println();
            a++;
            b = a;
        }
    }
}
