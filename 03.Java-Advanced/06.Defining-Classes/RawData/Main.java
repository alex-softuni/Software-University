package RawData;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Car> cars = new LinkedList<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String model = tokens[0];

            int engineSpeed = Integer.parseInt(tokens[1]);
            int enginePower = Integer.parseInt(tokens[2]);
            Engine engine = new Engine(engineSpeed, enginePower);

            int cargoWeight = Integer.parseInt(tokens[3]);
            String cargoType = tokens[4];
            Cargo cargo = new Cargo(cargoWeight, cargoType);

            int count = 0;
            Tire[] tires = new Tire[4];
            for (int j = 5; j < tokens.length; j += 2) {
                double tirePressure = Double.parseDouble(tokens[j]);
                int tireAge = Integer.parseInt(tokens[j + 1]);

                tires[count++] = new Tire(tirePressure, tireAge);
            }
            Car car = new Car(model, engine, cargo, tires);
            cars.add(car);
        }

        String type = scanner.nextLine();

        if (type.equals("fragile")) {
            for (Car car : cars) {
                boolean isFragile = car.getCargo().getType().equals("fragile");
                boolean isPressureGreaterThanOne = false;
                for (Tire tire : car.getTires()) {
                    if (tire.getPressure() < 1) {
                        isPressureGreaterThanOne = true;
                        break;
                    }
                }
                if (isFragile && isPressureGreaterThanOne) {
                    System.out.println(car.getModel());
                }
            }

        } else if (type.equals("flamable")) {
            for (Car car : cars) {
                boolean isFlamable = car.getCargo().getType().equals("flamable");
                boolean isGreaterThanNum = car.getEngine().getEnginePower() > 250;

                if (isFlamable && isGreaterThanNum) {
                    System.out.println(car.getModel());
                }
            }
        }
    }
}
