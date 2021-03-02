package ShoppingSpree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Person> people = new LinkedHashMap<>();
        String[] infoPeople = reader.readLine().split(";");
        for (String in : infoPeople) {

            String[] tokens = in.split("=");
            Person person = new Person(tokens[0], Double.parseDouble(tokens[1]));
            people.putIfAbsent(tokens[0], person);

        }

        Map<String, Product> products = new LinkedHashMap<>();
        String[] infoProducts = reader.readLine().split(";");
        for (String in : infoProducts) {

            String[] tokens = in.split("=");
            Product product = new Product(tokens[0], Double.parseDouble(tokens[1]));
            products.putIfAbsent(tokens[0], product);
        }

        String line;
        while (!"END".equals(line = reader.readLine())) {
            String[] input = line.split("\\s+");
            String name = input[0];
            String nameOfProduct = input[1];
            if (people.get(name) == null && products.get(nameOfProduct) == null) {
                continue;
            }
            try {
                people.get(name).buyProduct(products.get(nameOfProduct));

            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
            }
        }

        people.values().forEach(p -> {
            StringBuilder result = new StringBuilder();
            if (p.getProducts().size() == 0) {
                result.append(String.format("%s - Nothing bought", p.getName()));
            } else {
                result.append(String.format("%s - %s", p.getName(), p.getProducts().stream().map(Product::getName).collect(Collectors.joining(", "))));
            }

            System.out.println(result.toString());
        });
    }
}
