import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Articles {
    static class Article {
        String title;
        String content;
        String author;


        public String getTitle() {
            return title;
        }

        public String getContent() {
            return content;
        }

        public String getAuthor() {
            return author;
        }

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        @Override
        public String toString() {
            return String.format("%s - %s: %s%n", title, content, author);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Article> articles = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(",\\s+");
            Article article = new Article(data[0], data[1], data[2]);
            articles.add(article);

        }
        String command = scanner.nextLine();
        switch (command) {
            case "title":
                articles.sort(Comparator.comparing(Article::getTitle));
                System.out.println(articles.toString().replaceAll("[\\[\\],]", ""));
                break;
            case "content":
                articles.sort(Comparator.comparing(Article::getContent));
                System.out.println(articles.toString().replaceAll("[\\[\\],]", ""));
                break;
            case "author":
                articles.sort(Comparator.comparing(Article::getAuthor));
                System.out.println(articles.toString().replaceAll("[\\[\\],]", ""));
                break;
        }
    }
}