package parking;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Parking {
    private List<Car> data;
    private String type;
    private int capacity;

    public Parking(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void add(Car car) {
        if (this.data.size() < this.capacity) {
            this.data.add(car);
        }
    }

    public boolean remove(String manufacturer, String model) {
        return this.data.removeIf(car -> car.getManufacturer().equals(manufacturer)
                && car.getModel().equals(model));
    }

    public Car getLatestCar() {
        Car result = null;
        for (Car car : this.data) {
            if (result == null || result.getYear() < car.getYear()) {
                result = car;
            }
        }
        return result;
    }

    public Car getCar(String manufacturer, String model) {
        for (Car car : this.data) {
            if (car.getManufacturer().equals(manufacturer)
                    && car.getModel().equals(model)) {
                return car;
            }
        }
        return null;
    }

    public int getCount() {
        return this.data.size();
    }

    public String getStatistics() {
        StringBuilder out = new StringBuilder();

        out.append(String.format("The cars are parked in %s:%n", this.type));

        for (Car car : data) {
            out.append(car.toString()).append(System.lineSeparator());
        }

        return out.toString().trim();
    }
}
