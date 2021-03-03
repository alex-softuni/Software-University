package PizzaCalories;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] pizzaInput = reader.readLine().split("\\s+");
        String[] doughInput = reader.readLine().split("\\s+");


        Pizza pizza = new Pizza(pizzaInput[1], Integer.parseInt(pizzaInput[2]));
        Dough dough = new Dough(doughInput[1], doughInput[2], Double.parseDouble(doughInput[3]));
        pizza.setDough(dough);

        String line;
        while (!(line = reader.readLine()).equals("END")) {
            String[] toppingInput = line.split("\\s+");
            Topping topping = new Topping(toppingInput[1], Double.parseDouble(toppingInput[2]));
            pizza.addTopping(topping);
        }
        System.out.println(pizza.toString());
    }
}
