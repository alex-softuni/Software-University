package CarSalesMan;

public class Car {
    private String model;
    private Engine engine;
    private int weight;
    private String color;

    // Including all info

    public Car(String model, Engine engine, int weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    // Including all info except weight
    public Car(String model, Engine engine, String color) {
        this(model, engine, 0, color);
    }

    // Including all info except color
    public Car(String model, Engine engine, int weight) {
        this(model, engine, weight, "n/a");
    }

    // Including only mandatory
    public Car(String model, Engine engine) {
        this(model, engine, 0, "n/a");
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(this.model);
        sb.append(":")
                .append(System.lineSeparator());
        sb.append(this.engine)
                .append(System.lineSeparator());
        sb.append("Weight: ")
                .append(this.weight == 0 ? "n/a" : this.weight)
                .append(System.lineSeparator());
        sb.append("Color: ")
        .append(this.color);
        return sb.toString().trim();
    }
}