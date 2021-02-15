import java.util.Scanner;

public class E02SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sumOfDigits = 0;
        for (int i = 0; i <= n; i++) {
            while (n > 0) {
                sumOfDigits += n % 10;
                n = n / 10;

            }
            System.out.println(sumOfDigits);

        }
    }

}
