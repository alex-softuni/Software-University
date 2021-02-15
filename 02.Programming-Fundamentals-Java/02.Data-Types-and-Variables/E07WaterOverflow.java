import java.util.Scanner;

public class E07WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int tank = 0;

        ;
        for (int i = 0; i < n; i++) {
            int litres = scanner.nextInt();

            if (tank + litres > 255) {
                System.out.println("Insufficient capacity!");

            } else {
                tank += litres;
            }
        }
        System.out.println(tank);
    }
}
