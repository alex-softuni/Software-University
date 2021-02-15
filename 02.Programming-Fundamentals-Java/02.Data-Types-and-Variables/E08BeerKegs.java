import java.util.Scanner;

public class E08BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        double maxVolume = 0;
        String biggerKegModel = "";

        for (int i = 0; i < n; i++) {
            String model = scanner.nextLine();
            double radiusOfKeg = Double.parseDouble(scanner.nextLine());
            int kegHeight = Integer.parseInt(scanner.nextLine());

            double volumeOfKeg = Math.PI * radiusOfKeg * radiusOfKeg * kegHeight;

            if (volumeOfKeg > maxVolume) {
                maxVolume = volumeOfKeg;
                biggerKegModel = model;
            }
        }
        System.out.println(biggerKegModel);
    }
}
