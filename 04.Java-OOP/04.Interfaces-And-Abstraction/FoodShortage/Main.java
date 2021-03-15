package FoodShortage;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Buyer> buyers = new HashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            Buyer buyer = null;
            if (tokens.length == 3) {
                buyer = new Rebel(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
                buyers.put(buyer.getName(), buyer);
            } else if (tokens.length == 4) {
                buyer = new Citizen(tokens[0], Integer.parseInt(tokens[1]), tokens[2], tokens[3]);
                buyers.put(buyer.getName(), buyer);
            }
        }

        String line;
        while (!(line = scanner.nextLine()).equals("End")) {

            for (String name : buyers.keySet()) {
                if (name.equals(line)) {
                    buyers.get(name).buyFood();
                }
            }

            System.out.println(buyers
                    .values()
                    .stream()
                    .mapToInt(Buyer::getFood)
                    .sum()
            );
        }
    }
}
