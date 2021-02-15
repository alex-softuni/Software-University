import java.util.*;

public class MinerTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, Integer> map = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("stop")) {

            if (!map.containsKey(input)) {
                map.put(input, 0);
            }
            Integer quantity = Integer.parseInt(scanner.nextLine());
            map.put(input, map.get(input) + quantity);

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }

    }
}
