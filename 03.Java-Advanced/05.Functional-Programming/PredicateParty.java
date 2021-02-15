import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateParty {
    static List<String> people = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        people = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("Party!")) {
            String[] input = command.split("\\s+");
            String order = input[0];
            String criteria = input[1];
            String str = input[2];

            switch (order) {
                case "Remove":
                    if (criteria.equals("StartsWith")) {
                        people.removeIf(person -> person.startsWith(str));
                    } else if (criteria.equals("EndsWith")) {
                        people.removeIf(person -> person.endsWith(str));
                    } else if (criteria.equals("Length")) {
                        people.removeIf(person -> person.length() == Integer.parseInt(str));
                    }
                    break;
                case "Double":
                    if (criteria.equals("StartsWith")) {
                        addOneMore(name -> name.startsWith(str));
                    } else if (criteria.equals("EndsWith")) {
                        addOneMore(name -> name.endsWith(str));
                    } else if (criteria.equals("Length")) {
                        addOneMore(name -> name.length() == Integer.parseInt(str));
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        if (people.isEmpty()) {
            System.out.println("Nobody is going to the party!");
        } else {
            Collections.sort(people);
            System.out.println(people.toString().replaceAll("([\\[\\]])", "") + " are going to the party!");

        }

    }

    public static void addOneMore(Predicate<String> predicate) {
        List<String> namesToAdd = new ArrayList<>();
        people.stream().filter(predicate).forEach(namesToAdd::add);
        people.addAll(namesToAdd);
    }
}