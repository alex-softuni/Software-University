import java.util.Locale;
import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(scanner.nextLine());

        String command = scanner.nextLine();
        while (!command.equals("Done")) {
            String[] tokens = command.split(" ");

            switch (tokens[0]) {
                case "Change":
                    String replacement = tokens[1];
                    sb = new StringBuilder(sb.toString().replace(replacement, tokens[2]));
                    System.out.println(sb.toString());
                    break;
                case "Includes":
                    if (sb.toString().contains(tokens[1])) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "End":
                    if (sb.toString().endsWith(tokens[1])) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "Uppercase":
                    sb = new StringBuilder(sb.toString().toUpperCase());
                    System.out.println(sb);
                    break;
                case "FindIndex":
                    String charAsString = tokens[1];
                    System.out.println(sb.toString().indexOf(charAsString));
                    break;
                case "Cut":
                    int startIndex = Integer.parseInt(tokens[1]);
                    int length = Integer.parseInt(tokens[2]);
                    sb = new StringBuilder(sb.toString().substring(startIndex, startIndex +length));
                    System.out.println(sb);
                    break;
            }


            command = scanner.nextLine();
        }
    }
}
