package CustomException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            Student student = new Student("4havdar", "me@.bg");
        }catch (InvalidPersonNameException e) {
            System.out.println(e.getMessage());
        }
    }
}
