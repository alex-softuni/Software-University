import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LargestThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         Arrays.stream(scanner.nextLine().split(" "))
                 
                .map(Integer::parseInt)
                .sorted((n1,n2) -> n2.compareTo(n1))
                .limit(3)
                .forEach(num -> System.out.print(num + " "));
    }
}
