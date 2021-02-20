import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Cooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> liquids = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));

        ArrayDeque<Integer> ingredients = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(ingredients::push);

        int bread = 0;
        int cake = 0;
        int pastry = 0;
        int fruitPie = 0;

        while (!liquids.isEmpty() && !ingredients.isEmpty()) {
            int liquidValue = liquids.poll();
            int ingredientValue = ingredients.pop();

            int sum = liquidValue + ingredientValue;

            if (sum <= 25) {
                ingredients.pop();
                bread++;
            } else if (sum <= 50) {
                ingredients.pop();
                cake++;
            } else if (sum <= 75) {
                ingredients.pop();
                pastry++;
            } else if (sum <= 100) {
                ingredients.pop();
                fruitPie++;
            } else {
                ingredients.push(ingredientValue + 3);
            }
        }

        String message = hasCookedAll(bread, cake, pastry, fruitPie)
                ? "Wohoo! You succeeded in cooking all the food!"
                : "Ugh, what a pity! You didn't have enough materials to cook everything.";

        System.out.println(message);
    }

    private static boolean hasCookedAll(int bread, int cake, int pastry, int fruitPie) {
        return bread > 0 && cake > 0 && pastry > 0 && fruitPie > 0;
    }
}
