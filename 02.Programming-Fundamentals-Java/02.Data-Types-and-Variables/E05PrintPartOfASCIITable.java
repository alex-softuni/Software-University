import java.util.Scanner;

public class E05PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstChar = Integer.parseInt(scanner.nextLine());
        int secondChar = Integer.parseInt(scanner.nextLine());

        for (int i = firstChar; i <= secondChar ; i++) {
            System.out.print((char) i + " ");
        }

    }
}
