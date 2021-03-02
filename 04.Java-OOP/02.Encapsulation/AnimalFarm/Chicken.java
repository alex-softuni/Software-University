package AnimalFarm;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    private void setName(String name) {
        if (!isValid(name) || name.trim().isEmpty()) {
            throw new IllegalStateException("Name cannot be empty.");
        }
        this.name = name;
    }

    private void setAge(int age) {
        if (age < 0 || age > 15) {
            throw new IllegalStateException("Age should be between 0 and 15.");
        }
        this.age = age;
    }

    private boolean isValid(String name) {
        for (char symbol : name.toCharArray()) {
            if (symbol == ' ') {
                return false;
            }
        }
        return true;
    }

    public double productPerDay() {
        return calculateProductPerDay();
    }

    private double calculateProductPerDay() {
        if (age < 6) {
            return 2.00;
        } else if (age < 12) {
            return 1.00;
        }
        return 0.75;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Chicken %s (age %d) can produce %.2f eggs per day.", this.name, this.age, this.productPerDay()));
        return sb.toString();
    }

}
