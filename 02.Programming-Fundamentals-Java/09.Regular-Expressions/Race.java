import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameRegex = "[A-Za-z]";
        String distanceRegex = "\\d";

        Pattern pattern = Pattern.compile(nameRegex);
        Pattern digitPattern = Pattern.compile(distanceRegex);

        List<String> participants = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        LinkedHashMap<String, Integer> racers = new LinkedHashMap<>();
        StringBuilder sb = new StringBuilder();

        String input = scanner.nextLine();
        while (!input.equals("end of race")) {
            int sumDistance = 0;
            Matcher nameMatcher = pattern.matcher(input);
            Matcher digitMatcher = digitPattern.matcher(input);

            while (nameMatcher.find()) {
                sb.append(nameMatcher.group());
                if (participants.contains(String.valueOf(sb))) {
                    if (!racers.containsKey(String.valueOf(sb))) {
                        racers.put(String.valueOf(sb), 0);
                        break;
                    }
                }
            }
            while (digitMatcher.find()) {
                sumDistance += Integer.parseInt(digitMatcher.group());
            }
            if (participants.contains(String.valueOf(sb))) {
                if (racers.containsKey(String.valueOf(sb))) {
                    int oldValue = racers.get(String.valueOf(sb));
                    racers.put(String.valueOf(sb), oldValue + sumDistance);
                }
            }
            sb.setLength(0);
            input = scanner.nextLine();
        }
        List<String> winners = racers.entrySet().stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .limit(3)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        int count = 1;
        for (String winner : winners) {
            switch (count++) {
                case 1:
                    System.out.println("1st place: " + winner);
                    break;
                case 2:
                    System.out.println("2nd place: " + winner);
                    break;
                case 3:
                    System.out.println("3rd place: " + winner);
                    break;
            }
        }

    }
}
