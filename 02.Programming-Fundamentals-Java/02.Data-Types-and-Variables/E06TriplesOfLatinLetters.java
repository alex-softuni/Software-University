import java.util.Scanner;

public class E06TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (char i = 97; i < n + 97; i++) {
            for (char j = 97; j < n + 97; j++) {
                for (char k = 97; k < n + 97; k++) {
                    System.out.printf("%c%c%c%n",i,j,k);
                }

            }
        }
    }
}
