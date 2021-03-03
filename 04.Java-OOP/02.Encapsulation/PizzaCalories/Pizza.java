package PizzaCalories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private List<Topping> toppings;

    public Pizza(String name, int numberOfToppings) {
        setToppings(numberOfToppings);
        this.name = name;
    }
    private Dough getDough() {
        return this.dough;
    }
    public void setDough(Dough dough) {
        this.dough = dough;
    }

    private void setName(String name) {
        if (name.trim().isEmpty() || name.length() > 15) {
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void setToppings(int numberOfToppings) {
        if (numberOfToppings < 0 || numberOfToppings > 10) {
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
        this.toppings = new ArrayList<>();
    }


    public List<Topping> getToppings() {
        return toppings;
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    public double getOverallCalories() {
        return getDough().calculateCalories() +
                getToppings()
                        .stream()
                        .mapToDouble(Topping::calculateCalories)
                        .sum();

    }



    @Override
    public String toString() {
        return String.format("%s - %.2f", getName(), getOverallCalories());
    }
}
