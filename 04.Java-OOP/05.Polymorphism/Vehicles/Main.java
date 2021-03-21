package Vehicles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] carInfo = reader.readLine().split("\\s+");
        Car car = new Car(Double.parseDouble(carInfo[1]), Double.parseDouble(carInfo[2]), Double.parseDouble(carInfo[3]));

        String[] truckInfo = reader.readLine().split("\\s+");
        Truck truck = new Truck(Double.parseDouble(truckInfo[1]), Double.parseDouble(truckInfo[2]), Double.parseDouble(truckInfo[3]));

        String[] busInfo = reader.readLine().split("\\s+");
        Bus bus = new Bus(Double.parseDouble(busInfo[1]), Double.parseDouble(busInfo[2]), Double.parseDouble(busInfo[3]));

        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = reader.readLine().split("\\s+");
            String vehicleType = tokens[1];
            double amount = Double.parseDouble(tokens[2]);
            if (vehicleType.equals("Car")) {
                if (tokens[0].equals("Drive")) {
                    car.drive(amount);
                } else if (tokens[0].equals("Refuel")) {
                    car.refuel(amount);
                }
            } else if (vehicleType.equals("Truck")) {
                if (tokens[0].equals("Drive")) {
                    truck.drive(amount);
                } else if (tokens[0].equals("Refuel")) {
                    truck.refuel(amount);
                }
            } else if (vehicleType.equals("Bus")) {
                if (tokens[0].equals("Drive")) {
                    Bus.setIsBusEmpty(false);
                    bus.drive(amount);
                } else if (tokens[0].equals("DriveEmpty")) {
                    Bus.setIsBusEmpty(true);
                    bus.drive(amount);
                } else if (tokens[0].equals("Refuel")) {
                    bus.refuel(amount);
                }
            }
        }
        System.out.println(car);
        System.out.println(truck);
        System.out.println(bus);
    }
}
