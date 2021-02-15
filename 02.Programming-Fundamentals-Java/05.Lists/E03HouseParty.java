import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E03HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> guests = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String name = tokens[0];
            if (tokens.length == 3) {
                if (guests.contains(name)) {
                    System.out.println(name + " is already in the list!");
                } else {
                    guests.add(name);
                }
            } else {
                if (!guests.contains(name)) {
                    System.out.println(name + " is not in the list!");
                } else {
                    guests.remove(name);
                }
            }
        }
        for (String guest : guests) {
            System.out.println(guest + " ");
        }

    }
}






