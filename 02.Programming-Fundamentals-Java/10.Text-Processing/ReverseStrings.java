import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        while (!input.equals("end")) {
            char[] ch = input.toCharArray();

            StringBuilder sb = new StringBuilder();

            for (int i = ch.length - 1; i >= 0; i--) {
                sb.append(ch[i]);
            }
            System.out.println(input + " = " + sb);
            sb.setLength(0);
            input = scanner.nextLine();
        }
    }
}
