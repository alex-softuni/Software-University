
package greedyTimes;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long capacity = Long.parseLong(scanner.nextLine());
        String[] treasureSafe = scanner.nextLine().split("\\s+");

        var bag = new LinkedHashMap<String, LinkedHashMap<String, Long>>();


        for (int i = 0; i < treasureSafe.length; i += 2) {
            String name = treasureSafe[i];
            long quantityOfTreasure = Long.parseLong(treasureSafe[i + 1]);

            String type = getType(name);

            if (type.equals("")) {
                continue;
            } else if (capacity < getQuantityOfBag(bag) + quantityOfTreasure) {
                continue;
            }

            switch (type) {
                case "Gem":
                    if (!bag.containsKey(type)) {
                        if (bag.containsKey("Gold")) {
                            if (quantityOfTreasure > getQuantity(bag.get("Gold"))) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (getQuantity(bag.get(type)) + quantityOfTreasure > getQuantity(bag.get("Gold"))) {
                        continue;
                    }
                    break;
                case "Cash":
                    if (!bag.containsKey(type)) {
                        if (bag.containsKey("Gem")) {
                            if (quantityOfTreasure > getQuantity(bag.get("Gold"))) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (getQuantity(bag.get(type)) + quantityOfTreasure > getQuantity(bag.get("Gem"))) {
                        continue;
                    }
                    break;
            }

            if (!bag.containsKey(type)) {
                bag.put((type), new LinkedHashMap<String, Long>());
            }

            if (!bag.get(type).containsKey(name)) {
                bag.get(type).put(name, 0L);
            }


            bag.get(type).put(name, bag.get(type).get(name) + quantityOfTreasure);

        }

        printSortedValues(bag);
    }

    private static String getType(String name) {
        String type = "";

        if (name.length() == 3) {
            type = "Cash";
        } else if (name.toLowerCase().endsWith("gem")) {
            type = "Gem";
        } else if (name.toLowerCase().equals("gold")) {
            type = "Gold";
        }
        return type;
    }

    private static long getQuantityOfBag(LinkedHashMap<String, LinkedHashMap<String, Long>> bag) {
        return bag.values().stream().map(Map::values).flatMap(Collection::stream).mapToLong(e -> e).sum();
    }

    private static long getQuantity(LinkedHashMap<String, Long> stringLongLinkedHashMap) {
        return stringLongLinkedHashMap.values().stream().mapToLong(e -> e).sum();
    }

    private static void printSortedValues(LinkedHashMap<String, LinkedHashMap<String, Long>> bag) {
        for (var x : bag.entrySet()) {
            Long sumValues = getQuantity(x.getValue());

            System.out.println(String.format("<%s> $%s", x.getKey(), sumValues));

            x.getValue().entrySet().stream().sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey())).forEach(i -> System.out.println("##" + i.getKey() + " - " + i.getValue()));

        }
    }
}