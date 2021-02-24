package CardRank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Card Ranks:");
        for (CardRank value : CardRank.values()) {
            System.out.println(String.format("Ordinal value: %d; Name value: %s", value.ordinal(), value));
        }
    }
}
