import java.util.Scanner;

public class E01SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

      int smallerFirst = findSmallestNumber(firstNum,secondNum);
      int smallestNumber = findSmallestNumber(thirdNum,smallerFirst);

        System.out.println(smallestNumber);
    }

    public static int findSmallestNumber(int a, int b) {
        if (a > b) {
            return b;
        }
        return a;
    }

}
