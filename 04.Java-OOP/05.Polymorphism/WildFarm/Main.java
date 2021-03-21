package WildFarm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Animal> animals = new ArrayList<>();
//Cat Gray 1.1 Home Persian
//Vegetable 4
//End
        String line = scanner.nextLine();
        while (!line.equals("End")) {
            Animal animal = null;
            String[] tokens = line.split("\\s+");
            switch (tokens[0]) {
                case "Cat":
                    animal = new Cat(tokens[0], tokens[1], Double.parseDouble(tokens[2]), tokens[3], tokens[4]);
                    break;
                case "Tiger":
                    animal = new Tiger(tokens[0], tokens[1], Double.parseDouble(tokens[2]), tokens[3]);
                    break;
                case "Zebra":
                    animal = new Zebra(tokens[0], tokens[1], Double.parseDouble(tokens[2]), tokens[3]);

                    break;
                case "Mouse":
                    animal = new Mouse(tokens[0], tokens[1], Double.parseDouble(tokens[2]), tokens[3]);
                    break;
            }
            animals.add(animal);

            Food food = null;
            String[] foodInfo = scanner.nextLine().split("\\s+");
            if (foodInfo[0].equals("Vegetable")) {
                food = new Vegetable(Integer.parseInt(foodInfo[1]));
            } else if (foodInfo[0].equals("Meat")) {
                food = new Meat(Integer.parseInt(foodInfo[1]));
            }
            animal.makeSound();
            animal.eat(food);
            line = scanner.nextLine();
        }
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}
