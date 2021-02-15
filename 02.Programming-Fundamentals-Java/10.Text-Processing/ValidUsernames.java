import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        for (int i = 0; i < input.length; i++) {
            String username = input[i];
            boolean name = isValid(username);
            if (name) {
                System.out.println(username);
            }
        }

    }

    private static boolean isValid(String username) {
        if (!(username.length() >= 3 && (username.length() <= 16))) {
            return false;
        }
        for (int i = 0; i < username.length(); i++) {
            char[] symbol = username.toCharArray();
            char current = symbol[i];

            if (!Character.isLetterOrDigit(current) && current != '-' && current != '_') {
                return false;
            }
        }
        return true;
    }
}
