package Lab;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> guests = new TreeSet<>();


        String guestID = scanner.nextLine();
        while (!guestID.equals("PARTY")) {
            if (!guests.contains(guestID) && guestID.length() == 8) {
                guests.add(guestID);
            }

            guestID = scanner.nextLine();
        }

        guestID = scanner.nextLine();
        while (!guestID.equals("END")) {

            guests.remove(guestID);
            guestID = scanner.nextLine();
        }

        System.out.println(guests.size());
        guests.forEach(System.out::println);

    }
}
