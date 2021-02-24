package CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rankOfCard = scanner.nextLine();
        String suitOfCard = scanner.nextLine();

        int power = CardsWithPower.valueOf(rankOfCard).getValue() + SuitPowers.valueOf(suitOfCard).getValue();

        System.out.printf("Card name: %s of %s; Card power: %d"
                , rankOfCard, suitOfCard, power);
    }
}
