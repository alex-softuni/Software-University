import java.util.Scanner;

public class E11Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfSnowballs = Integer.parseInt(scanner.nextLine());

        double snowballValue = 0;
        for (int i = 0; i < numberOfSnowballs; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            snowballValue = Math.pow((snowballSnow /snowballTime), snowballQuality);
        }
    }
}
