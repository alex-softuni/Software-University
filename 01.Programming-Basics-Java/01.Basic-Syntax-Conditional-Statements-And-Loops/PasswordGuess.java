package ConditionalStatements.lab.excercises.Lab;

import javax.management.StringValueExp;
import java.util.Scanner;

public class PasswordGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String passWord = scanner.nextLine();
        String passTrue = "s3cr3t!P@ssw0rd";

                if(passWord.equals(passTrue)){
                    System.out.println("Welcome");
                }else{
                    System.out.println("Wrong password!");
                }

    }
}
