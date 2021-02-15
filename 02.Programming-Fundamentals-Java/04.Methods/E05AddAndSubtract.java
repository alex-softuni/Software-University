import java.util.Scanner;

public class E05AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        System.out.println(sumSubtractFromThirdInt(first,second,third));
    }

    public static int sumOfTwoIntegers(int a, int b) {
        return a + b;
    }

    public static int sumSubtractFromThirdInt(int a, int b, int c) {
        return sumOfTwoIntegers(a, b) - c;
    }
}
