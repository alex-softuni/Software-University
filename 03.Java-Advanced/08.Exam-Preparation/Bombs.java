package parking;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Bombs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> effects = Arrays.stream(scanner.nextLine().split(",\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));

        ArrayDeque<Integer> casings = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(",\\s+"))
                .map(Integer::parseInt)
                .forEach(casings::push);

        int daturaBombs = 0;
        int cherryBombs = 0;
        int smokeDecoyBombs = 0;
        while (!(effects.isEmpty()) && !(casings.isEmpty())) {
            if (hasAllBombs(daturaBombs, cherryBombs, smokeDecoyBombs)) {
                break;
            }
            int effect = effects.peek();
            int casing = casings.pop();
            int sum = effect + casing;
            if (sum == 40) {
                effects.poll();
                daturaBombs++;
            } else if (sum == 60) {
                effects.poll();
                cherryBombs++;
            } else if (sum == 120) {
                effects.poll();
                smokeDecoyBombs++;
            } else {
                casings.push(casing - 5);
            }
        }

        if (hasAllBombs(daturaBombs, cherryBombs, smokeDecoyBombs)) {
            System.out.println("Bene! You have successfully filled the bomb pouch!");
        } else {
            System.out.println("You don't have enough materials to fill the bomb pouch.");
        }
        String effectsOutput = "Bomb Effects: " +
                (effects.isEmpty() ? "empty"
                        : effects.stream()
                        .map(String::valueOf)
                        .collect(Collectors.joining(", ")));

        System.out.println(effectsOutput);

        String casingsOutput = "Bomb Casings: " +
                (casings.isEmpty() ? "empty"
                        : casings.stream()
                        .map(String::valueOf)
                        .collect(Collectors.joining(", ")));

        System.out.println(casingsOutput);

        System.out.println("Cherry Bombs: " + cherryBombs);
        System.out.println("Datura Bombs: " + daturaBombs);
        System.out.println("Smoke Decoy Bombs: " + smokeDecoyBombs);
    }

    private static boolean hasAllBombs(int daturaBombs, int cherryBombs, int smokeDecoyBombs) {
        return daturaBombs >= 3
                && cherryBombs >= 3
                && smokeDecoyBombs >= 3;
    }
}
