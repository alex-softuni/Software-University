import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] phrase = {"Excellent product.",
                "Such a great product.",
                "I always use that product.",
                "Best product of its category.",
                "Exceptional product.",
                "I can’t live without this product."};

        String[] events = {"Now I feel good.",
                "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.",
                "I feel great!"};

        String[] authors = {"Diana", "Petya", "Stella", "Elena",
                "Katya", "Iva", "Annie", "Eva"};

        String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        int numberOfMessages = Integer.parseInt(scanner.nextLine());

        Random rnd = new Random();

        for (int i = 0; i < numberOfMessages; i++) {

            int randomPhraseNum = rnd.nextInt(phrase.length);
            int randomEventsNum = rnd.nextInt(events.length);
            int randomCitiesNum = rnd.nextInt(cities.length);
            int randomAuthorNum = rnd.nextInt(authors.length);

            System.out.println(String.join(" ",phrase[randomPhraseNum] + " " + events[randomEventsNum] + " "+ authors[randomAuthorNum] + " - " + cities[randomCitiesNum]));
        }

    }
}
