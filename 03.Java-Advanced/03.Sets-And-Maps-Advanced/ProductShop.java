package Lab;

import java.util.*;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, Double>> info = new TreeMap<>();

        String input = scanner.nextLine();

        while (!input.equals("Revision")) {
            String[] data = input.split(", ");

            String shop = data[0];
            String product = data[1];
            double price = Double.parseDouble(data[2]);

            info.putIfAbsent(shop, new LinkedHashMap<>());
            info.get(shop).putIfAbsent(product, price);


            input = scanner.nextLine();
        }

        for (Map.Entry<String, Map<String, Double>> entry : info.entrySet()) {
            System.out.println(entry.getKey() + "->");
            for (Map.Entry<String, Double> productsInfo : entry.getValue().entrySet()) {
                String product = productsInfo.getKey();
                double price = productsInfo.getValue();

                System.out.println(String.format("Product: %s, Price: %.1f", product, price));
            }

        }

    }
}
