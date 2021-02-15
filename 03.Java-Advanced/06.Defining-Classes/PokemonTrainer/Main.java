package PokemonTrainer;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Trainer> trainerMap = new LinkedHashMap<>();
        String input = scanner.nextLine();

        // Тук си напълвам trainerMap
        while (!input.equals("Tournament")) {
            String[] tokens = input.split("\\s+");
            String trainerName = tokens[0];
            String pokemonName = tokens[1];
            String element = tokens[2];
            int health = Integer.parseInt(tokens[3]);
            Trainer trainer = new Trainer(trainerName, 0);
            Pokemon pokemon = new Pokemon(pokemonName, element, health);
            // Проверявам дали го има, за да не инициализирам листа на ново.
            if (!trainerMap.containsKey(trainerName)) {
                trainer.initializeList();
                trainerMap.put(trainerName, trainer);
            }
            // Съответно ако съществува си го добавям, дотук всичко изглежда наред
            trainerMap.get(trainerName).getPokemonList().add(pokemon);

            input = scanner.nextLine();
        }
        // тук съм създал булева, която проверява дали
        // трейнъра има елемент и ако е false намалявам с -10 живота на всички покемони
        boolean hasElement = false;
        input = scanner.nextLine();
        while (!input.equals("End")) {

            for (Trainer trainer : trainerMap.values()) {
                if (trainer.getPokemonList().size() > 0) {
                    for (int i = 0; i < trainer.getPokemonList().size(); i++) {
                        String element = trainer.getPokemonList().get(i).getElement();
                        // тук проверявам дали елемента от текущия покемон от i са равни с input
                        if (input.equals(element)) {
                            int badgesCount = trainer.getNumberOfBadges();
                            trainer.setNumberOfBadges(badgesCount + 1);
                            hasElement = true;
                            break;
                        } else {
                            trainer.subtractFromHealth(10);
                            if (!hasElement) {
                                trainer.removeDeadPokemon();
                            }

                        }

                    }
                }
            }
            input = scanner.nextLine();

        }

        trainerMap.values()
                .stream()
                .sorted((t1, t2) -> {
                    if (t1.getNumberOfBadges() != t2.getNumberOfBadges()) {
                        return Integer.compare(t2.getNumberOfBadges(), t1.getNumberOfBadges());
                    }
                    // връщам нула ако са равни да ги принтира както са получени
                    return 0;
                })
                .forEach(trainer -> System.out.println(trainer.toString()));

    }
}

