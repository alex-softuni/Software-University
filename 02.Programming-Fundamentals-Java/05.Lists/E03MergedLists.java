import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E03MergedLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = parseInt(scanner);
        List<Integer> secondList = parseInt(scanner);
        List<Integer> mergedList = new ArrayList<>();

        if (firstList.size() > secondList.size()) {
            for (int i = 0; i < firstList.size(); i++) {
                mergedList.add(firstList.get(i));
                if (i < secondList.size()) {
                    mergedList.add(secondList.get(i));
                }
            }
        } else {
            for (int i = 0; i < secondList.size(); i++) {
                if (i < firstList.size()) {
                    mergedList.add(firstList.get(i));
                }
                mergedList.add(secondList.get(i));
            }
        }
        for (Integer integer : mergedList) {
            System.out.print(integer + " ");
        }
    }

    private static List<Integer> parseInt(Scanner scanner) {
        List<Integer> list = new ArrayList<>();
        String line = scanner.nextLine();
        String[] numbersAsString = line.split(" ");
        for (int i = 0; i < numbersAsString.length; i++) {
            list.add(Integer.parseInt(numbersAsString[i]));
        }
        return list;
    }
}



