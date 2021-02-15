import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder allStops = new StringBuilder(scanner.nextLine());


        String input = scanner.nextLine();
        while (!input.equals("Travel")) {
            String[] commands = input.split(":");

            switch (commands[0]) {
                case "Add Stop":
                    int index = Integer.parseInt(commands[1]);
                    if (index >= 0 && index <= allStops.length()) {
                        allStops.insert(index, commands[2]);
                    }
                    break;
                case "Remove Stop":
                    int fromIndex = Integer.parseInt(commands[1]);
                    int toIndex = Integer.parseInt(commands[2]) + 1;
                    if (fromIndex >= 0 && fromIndex <= allStops.length()
                            && toIndex >= 0 && toIndex <= allStops.length()) {
                        allStops.delete(fromIndex, toIndex);
                    }
                    break;
                case "Switch":
                    String oldString = commands[1];
                    String newString = commands[2];
                   allStops = new StringBuilder(allStops.toString().replace(oldString, newString));
                    break;
            }

            System.out.println(allStops.toString());
            input = scanner.nextLine();
        }
        System.out.println("Ready for world tour! Planned stops: " + allStops);
    }
}
