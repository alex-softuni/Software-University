package Vehicles;

import java.text.DecimalFormat;

public class Car extends Vehicle {


    protected Car(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    @Override
    public void drive(double distance) {
        double fuelCost = distance * (getFuelConsumption() + 0.9);
        if (fuelCost < getFuelQuantity()) {
            setFuelQuantity(getFuelQuantity() - fuelCost);
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            System.out.printf("Car travelled %s km%n", decimalFormat.format(distance));
        } else {
            System.out.println("Car needs refueling");
        }
    }

    @Override
    public void refuel(double liters) {
        if (liters > 0) {
            double total = liters + getFuelQuantity();
            if (total <= super.getTankCapacity()) {
                setFuelQuantity(super.getFuelQuantity() + liters);
            } else {
                System.out.println("Cannot fit fuel in tank");
            }
        } else {
            System.out.println("Fuel must be a positive number");
        }
    }
}
