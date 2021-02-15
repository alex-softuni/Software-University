package CarSalesMan;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Engine> engineMap = new HashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String model = tokens[0];
            int power = Integer.parseInt(tokens[1]);
            Engine engine = null;
            if (tokens.length == 2) {
                engine = new Engine(model, power);
            } else if (tokens.length == 3) {
                String obj = tokens[2];
                if (Character.isDigit(obj.charAt(0))) {
                    int displacement = Integer.parseInt(tokens[2]);
                    engine = new Engine(model, power, displacement);
                } else {
                    String efficiency = tokens[2];
                    engine = new Engine(model, power, efficiency);
                }
            } else if (tokens.length == 4) {
                int displacement = Integer.parseInt(tokens[2]);
                String efficiency = tokens[3];
                engine = new Engine(model, power, displacement, efficiency);
            }
            engineMap.putIfAbsent(model, engine);
        }
        List<Car> cars = new ArrayList<>();
        int m = Integer.parseInt(scanner.nextLine());
// Model , Engine : then ->A Car's weight and color are optional
        for (int i = 0; i < m; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String model = tokens[0];
            Engine engine = engineMap.get(tokens[1]);

            Car car = null;
            if (tokens.length == 2) {
                car = new Car(model, engine);
            } else if (tokens.length == 3) {
                String obj = tokens[2];
                if (Character.isDigit(obj.charAt(0))) {
                    int weight = Integer.parseInt(tokens[2]);
                    car = new Car(model, engine, weight);
                } else {
                    String color = tokens[2];
                    car = new Car(model, engine, color);
                }
            } else if (tokens.length == 4) {
                int weight = Integer.parseInt(tokens[2]);
                String color = tokens[3];
                car = new Car(model, engine, weight, color);
            }
            cars.add(car);
        }

        cars.forEach(System.out::println);
    }
}
