import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String arithmeticalExpression = scanner.nextLine();

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < arithmeticalExpression.length(); i++) {
            char ch = arithmeticalExpression.charAt(i);
            int index = i;

            if (ch == '(') {
                stack.push(index);
            } else if (ch == ')') {
                int startIndex = stack.pop();
                String contents = arithmeticalExpression.substring(startIndex, index + 1);
                System.out.println(contents);
            }
        }


    }
}
