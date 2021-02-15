import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class WordCount {
    private static final String WORDS_PATH = "Exercises Resources/words.txt";
    private static final String TEXT_PATH = "Exercises Resources/text.txt";
    private static final String OUTPUT_PATH = "output.txt";

    public static void main(String[] args) throws IOException {
        BufferedReader wordReader = new BufferedReader(new FileReader(WORDS_PATH));
        BufferedReader textReader = new BufferedReader(new FileReader(TEXT_PATH));

        PrintWriter writer = new PrintWriter(OUTPUT_PATH);
        Map<String, Integer> map = new HashMap<>();
        String[] words = wordReader.readLine().split(" ");
        for (String word : words) {
            map.put(word, 0);
        }

        String[] text = textReader.readLine().split(" ");
        for (String word : text) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            }
        }

        map.entrySet()
                .stream()
                .sorted((v1, v2) -> v2.getValue().compareTo(v1.getValue()))
                .forEach(entry -> {
                    writer.println(String.format("%s - %d", entry.getKey(), entry.getValue()));
                });
        writer.close();


    }
}
