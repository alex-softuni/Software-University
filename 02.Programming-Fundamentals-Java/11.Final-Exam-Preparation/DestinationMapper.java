import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regEx = "([=/])(?<place>[A-Z][A-Za-z]{2,})\\1";
        String places = scanner.nextLine();

        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(places);

        List<String> locations = new ArrayList<>();
        while (matcher.find()) {

                locations.add(matcher.group("place"));

        }
        System.out.println("Destinations: " + String.join(", ", locations));
      int points =  locations.stream()
              .mapToInt(l -> l.length())
                .sum();
        System.out.println("Travel Points: " + points);
    }
}