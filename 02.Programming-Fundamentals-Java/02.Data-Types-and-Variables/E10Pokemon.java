import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class E10Pokemon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        int M = Integer.parseInt(scanner.nextLine());
        int Y = Integer.parseInt(scanner.nextLine());

        int currentN = N;
        int targetsCount = 0;

        while (currentN >= M) {
            currentN -= M;
            targetsCount++;

            if (currentN == N * 0.5 && Y != 0) {
                currentN /= Y;
            }
        }

        System.out.println(currentN);
        System.out.println(targetsCount);

    }
}