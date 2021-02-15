import java.util.Scanner;

public class E04PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pass = scanner.nextLine();
        boolean isValidLength = checkCharactersLength(pass);
        boolean consists = checkIfPassConsistsLettersAndDigits(pass);
        boolean hasTwoDigits = checkIfPassHasTwoDigits(pass);

        if (isValidLength && consists && hasTwoDigits) {
            System.out.println("Password is valid");
        }
        if (!isValidLength) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!consists) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!hasTwoDigits) {
            System.out.println("Password must have at least 2 digits");
        }

    }

    public static boolean checkCharactersLength(String pass) {
        return pass.length() >= 6 && pass.length() <= 10;
    }

    public static boolean checkIfPassConsistsLettersAndDigits(String pass) {
        for (int i = 0; i < pass.length(); i++) {
            char symbol = pass.charAt(i);
          boolean isDigit = Character.isDigit(symbol);
          boolean isLetter = Character.isLetter(symbol);
          if (!isDigit && !isLetter){
              return false;
            }
        }
        return true;
    }

    public static boolean checkIfPassHasTwoDigits(String pass) {
        int count = 0;
        for (int i = 0; i < pass.length(); i++) {
            char symbol = pass.charAt(i);
            if (Character.isDigit(symbol)) {
                count++;
            }
            if (count >= 2) {
                return true;
            }
        }
        return false;
    }
}
