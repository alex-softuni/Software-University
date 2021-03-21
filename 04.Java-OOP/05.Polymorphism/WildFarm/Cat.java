package WildFarm;

import java.text.DecimalFormat;

public class Cat extends Felime {
    private String breed;

    public Cat(String animalType, String animalName, Double animalWeight, String livingRegion, String breed) {
        super(animalType, animalName, animalWeight, livingRegion);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    void eat(Food food) {
        if (getFoodEaten() != null) {
            setFoodEaten(getFoodEaten() + food.getQuantity());
        } else {
            setFoodEaten(food.getQuantity());
        }
    }


    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        if(getFoodEaten() == null) {
            setFoodEaten(0);
        }
        return String.format("%s[%s, %s, %s, %s, %d]",
                getAnimalType(), getAnimalName(), getBreed(), df.format(getAnimalWeight()), getLivingRegion(), getFoodEaten());
    }
}
