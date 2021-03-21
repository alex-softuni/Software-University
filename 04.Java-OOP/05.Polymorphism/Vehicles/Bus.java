package Vehicles;

import java.text.DecimalFormat;
import java.util.regex.Pattern;

public class Bus extends Vehicle {
    public static boolean isBusEmpty;

    protected Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    public static void setIsBusEmpty(boolean isBusEmpty) {
        Bus.isBusEmpty = isBusEmpty;
    }

    @Override
    public void drive(double distance) {
        double fuelCost = isBusEmpty ?  distance * (super.getFuelConsumption()) : distance * (super.getFuelConsumption() + 1.4);
        if (fuelCost < getFuelQuantity()) {
            setFuelQuantity(getFuelQuantity() - fuelCost);
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            System.out.printf("Bus travelled %s km%n", decimalFormat.format(distance));
        } else {
            System.out.println("Bus needs refueling");
        }
    }

    @Override
    public void refuel(double liters) {
        if (liters > 0 ) {
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
