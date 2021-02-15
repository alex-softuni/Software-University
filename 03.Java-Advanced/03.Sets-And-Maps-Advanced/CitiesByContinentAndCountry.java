package Lab;

import java.util.*;

public class CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Map<String, ArrayList<String>>> info = new LinkedHashMap<>();

        while (n-- > 0) {
            String[] data = scanner.nextLine().split("\\s+");
            String continent = data[0];
            String country = data[1];
            String city = data[2];

            info.putIfAbsent(continent, new LinkedHashMap<>());
            info.get(continent).putIfAbsent(country, new ArrayList<>());
            info.get(continent).get(country).add(city);
        }
        for (Map.Entry<String, Map<String, ArrayList<String>>> continents : info.entrySet()) {
            System.out.println(continents.getKey() + ":");
            for (Map.Entry<String, ArrayList<String>> countryInfo : continents.getValue().entrySet()) {
                System.out.print("  " + countryInfo.getKey() + " -> ");
                List<String> list = countryInfo.getValue();
                System.out.println(String.join(", ", list));

            }
        }
    }
}



