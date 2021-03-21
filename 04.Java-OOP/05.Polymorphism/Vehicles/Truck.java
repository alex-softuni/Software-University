package Vehicles;

import java.text.DecimalFormat;

public class Truck extends Vehicle {


    protected Truck(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    @Override
    public void drive(double distance) {
        double fuelCost = distance * (getFuelConsumption() + 1.6);
        if (fuelCost < getFuelQuantity()) {
            setFuelQuantity(getFuelQuantity() - fuelCost);
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            System.out.printf("Truck travelled %s km%n", decimalFormat.format(distance));
        } else {
            System.out.println("Truck needs refueling");
        }
    }

    @Override
    public void refuel(double liters) {
        double amountAfterHole = liters * 0.95;
        double total = liters + getFuelQuantity();

        if (liters > 0) {
            if (total <= super.getTankCapacity()) {
                setFuelQuantity(getFuelQuantity() + amountAfterHole);
            } else {
                System.out.println("Cannot fit fuel in tank");
            }
        } else {
            System.out.println("Fuel must be a positive number");
        }
    }
}
