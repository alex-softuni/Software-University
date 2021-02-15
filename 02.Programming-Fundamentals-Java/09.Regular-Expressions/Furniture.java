import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> furnitureBought = new ArrayList<>();

        String regEx = ">>(?<furniture>\\w+)<<(?<price>\\d+(?:\\.\\d+)?)!(?<quantity>\\d+)";
        Pattern pattern = Pattern.compile(regEx);

        double totalSum = 0;

        String input = scanner.nextLine();
        while (!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                furnitureBought.add(matcher.group("furniture"));
                double totalPrice = Double.parseDouble(matcher.group("price"))
                        * Integer.parseInt(matcher.group("quantity"));

                totalSum += totalPrice;
            }
            input = scanner.nextLine();
        }

        System.out.println("Bought furniture:");
        for (String s : furnitureBought) {
            System.out.println(s);
        }
        System.out.printf("Total money spend: %.2f", totalSum);
    }
}
