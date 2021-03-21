package WildFarm;

import java.text.DecimalFormat;

public class Mouse extends Mammal {
    public Mouse(String animalType, String animalName, Double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight, livingRegion);
    }

    @Override
    void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }


    @Override
    void eat(Food food) {
        if (food instanceof Vegetable) {
            if (getFoodEaten() != null) {
                setFoodEaten(getFoodEaten() + food.getQuantity());
            } else {
                setFoodEaten(food.getQuantity());
            }
        } else {
            System.out.println("Mice are not eating that type of food!");
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
