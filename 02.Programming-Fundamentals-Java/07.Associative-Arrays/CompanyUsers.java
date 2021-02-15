import java.util.*;

public class CompanyUsers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> database = new TreeMap<>();
        String[] data = scanner.nextLine().split(" -> ");
        while (!data[0].equals("End")) {
            String company = data[0];
            String ID = data[1];
            if (!database.containsKey(company)) {
                database.put(company, new ArrayList<>());
                if (!database.containsValue(ID)) {
                    database.get(company).add(ID);
                }
            } else {
                if (!database.get(company).contains(ID)) {
                    database.get(company).add(ID);
                }
            }

            data = scanner.nextLine().split(" -> ");
        }
        database.entrySet()
                .stream()
                .forEach(e -> {
                    System.out.printf("%s%n", e.getKey().trim());
                    e.getValue()
                            .stream()
                            .forEach(v -> System.out.println("-- " + v));
                });
    }
}
