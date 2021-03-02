package ShoppingSpree;

import java.util.*;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        this.products = new ArrayList<>();
    }

    private void setName(String name) {
        if (name == null ||  name.trim().isEmpty() ||!isValid(name)) {
            throw new IllegalStateException("Name cannot be empty");
        }
        this.name = name;
    }

    private boolean isValid(String name) {
        for (char symbol : name.toCharArray()) {
            if (symbol == ' ') {
                return false;
            }
        }
        return true;
    }

    public String getName() {
        return name;
    }

    private void setMoney(double money) {
        if (money < 0){
            throw new IllegalStateException("Money cannot be negative");
        }
        this.money = money;
    }

    public List<Product> getProducts() {
        return Collections.unmodifiableList(products);
    }

    public void buyProduct(Product product) {
        if (money >= product.getCost()) {
            this.money -= product.getCost();
            this.products.add(product);
            System.out.printf("%s bought %s%n", getName(), product.getName());
        } else {
            System.out.printf("%s can't afford %s%n", getName(), product.getName());
        }
    }
}
