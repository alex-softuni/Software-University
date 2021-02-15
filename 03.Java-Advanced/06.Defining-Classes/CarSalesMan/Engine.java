package CarSalesMan;

public class Engine {
    // <Model> <Power> <Displacement> <Efficiency>
    private String model;
    private int power;
    private int displacement;
    private String efficiency;

    // Including all info
    public Engine(String model, int power, int displacement, String efficiency) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    // Including all info except displacement
    public Engine(String model, int power, String efficiency) { this(model, power, 0, efficiency); }

    // Including all info except efficiency
    public Engine(String model, int power, int displacement) { this(model, power, displacement, "n/a"); }

    // Including only mandatory info
    public Engine(String model, int power) { this(model, power, 0, "n/a"); }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(this.model);
        sb.append(":")
                .append(System.lineSeparator());
        sb.append("Power: ")
                .append(this.power)
                .append(System.lineSeparator());
        sb.append("Displacement: ")
                .append(this.displacement == 0 ? "n/a" : this.displacement)
                .append(System.lineSeparator());
        sb.append("Efficiency: ")
                .append(this.efficiency)
                .append(System.lineSeparator());

        return sb.toString().trim();

    }
}