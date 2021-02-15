import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(" ");

        int res = charMultiplier(array[0], array[1]);
        System.out.println(res);
    }

    private static int charMultiplier(String first, String second) {
        int sum = 0;
        char[] array = first.toCharArray();
        char[] secondArray = second.toCharArray();

        for (int i = 0; i < Math.min(first.length(), second.length()); i++) {
            sum += array[i] * secondArray[i];
        }
        if (first.length() > second.length()) {
            for (int i = 0; i < array.length - secondArray.length; i++) {
                sum += array[i];
            }
        } else {
            for (int i = 0; i < secondArray.length - array.length; i++) {
                sum += secondArray[i];
            }
        }
        return sum;
    }
}
