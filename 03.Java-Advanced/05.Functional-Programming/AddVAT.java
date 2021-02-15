import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class AddVAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] prices = Arrays.stream(scanner.nextLine().split(", "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        UnaryOperator<Double> addVat = value -> value * 1.20;

        System.out.println("Prices with VAT:");
        getVATandPrint(prices, addVat);
    }

    private static void getVATandPrint(double[] prices, UnaryOperator<Double> addVat) {
        Arrays.stream(prices)
               .map(addVat::apply)
               .forEach(e -> System.out.printf("%.2f%n", e));
    }
}
