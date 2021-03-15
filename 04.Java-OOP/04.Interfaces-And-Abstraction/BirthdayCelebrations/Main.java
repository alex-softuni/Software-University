package BirthdayCelebrations;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Birthable> birthables = new ArrayList<>();

        String line;
        while (!(line = scanner.nextLine()).equals("End")) {
            String[] tokens = line.split("\\s+");
            if (tokens[0].equals("Citizen")) {
                Citizen citizen = new Citizen(tokens[1], Integer.parseInt(tokens[2]), tokens[3], tokens[4]);
                birthables.add(citizen);
            } else if (tokens[0].equals("Robot")) {
                Robot robot = new Robot(tokens[1], tokens[2]);
            } else if (tokens[0].equals("Pet")) {
                Pet pet = new Pet(tokens[1], tokens[2]);
                birthables.add(pet);
            }
        }

        String year = scanner.nextLine();

        printBirthablesMatching(birthables, year);
    }

    private static void printBirthablesMatching(List<Birthable> birthables, String year) {
        birthables.stream()
                .filter(str -> str.getBirthDate().endsWith(year))
                .forEach(birthable -> System.out.println(birthable.getBirthDate()));
    }
}
