package WildFarm;

import java.text.DecimalFormat;

public class Tiger extends Mammal{
    public Tiger(String animalType, String animalName, Double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight, livingRegion);
    }

    @Override
    void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    void eat(Food food) {
        if (food instanceof Meat) {
            if (getFoodEaten() != null) {
                setFoodEaten(getFoodEaten() + food.getQuantity());
            } else {
                setFoodEaten(food.getQuantity());
            }
        } else {
            System.out.println("Tigers are not eating that type of food!");
        }
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        if(getFoodEaten() == null) {
            setFoodEaten(0);
        }
        return String.format("%s[%s, %s, %s, %d]",
                getAnimalType(), getAnimalName(), df.format(getAnimalWeight()), getLivingRegion(), getFoodEaten());
    }
}
