package PizzaCalories;

public class Topping {
    private String toppingType;
    private double weight;
    private double modifier;

    public Topping(String toppingType, double weight) {
        this.setToppingType(toppingType);
        this.setWeight(weight);
    }

    private void setToppingType(String toppingType) {

        switch (toppingType) {
            case "Meat":
                modifier = 1.2;
                this.toppingType = toppingType;
                break;
            case "Veggies":
                modifier = 0.8;
                this.toppingType = toppingType;
                break;
            case "Cheese":
                modifier = 1.1;
                this.toppingType = toppingType;
                break;
            case "Sauce":
                modifier = 0.9;
                this.toppingType = toppingType;
                break;
            default:
                throw new IllegalArgumentException(String
                        .format("Cannot place %s on top of your pizza.", toppingType));
        }
    }

    public double getWeight() {
        return weight;
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 50) {
            throw new IllegalArgumentException(String
                    .format("%s weight should be in the range [1..50].", this.toppingType));
        }
        this.weight = weight;
    }

    public double getModifier() {
        return modifier;
    }

    public double calculateCalories() {
        return 2 * getWeight() * getModifier();
    }
}
