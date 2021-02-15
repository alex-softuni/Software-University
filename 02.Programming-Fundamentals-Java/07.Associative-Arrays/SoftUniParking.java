import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> registered = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] cmd = scanner.nextLine().split(" ");
            String username = cmd[1];

            if (cmd[0].equals("register")) {
                String licensePlate = cmd[2];
                if (!registered.containsKey(username)) {
                    registered.put(username, licensePlate);
                    System.out.printf("%s registered %s successfully%n", username, licensePlate);
                } else {
                    System.out.printf("ERROR: already registered with plate number %s%n", licensePlate);
                }
            } else if (cmd[0].equals("unregister")) {
                if (!registered.containsKey(username)) {
                    System.out.printf("ERROR: user %s not found%n", username);
                } else {
                    registered.remove(username);
                    System.out.printf("%s unregistered successfully%n", username);
                }
            }
        }
        registered.entrySet()
                .stream()
                .forEach(e -> System.out.printf("%s => %s%n", e.getKey(), e.getValue()));
    }
}
