package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Functions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("END")) {
            String[] commands = input.split("\\s+");

            switch (commands[0]) {
                case "Change":
                    int paintingNumber = Integer.parseInt(commands[1]);
                    int changedNumber = Integer.parseInt(commands[2]);
                    if (numbers.contains(paintingNumber)) {
                        int index = numbers.indexOf(paintingNumber);
                        numbers.remove(index);
                        numbers.add(index, changedNumber);
                    }
                    break;
                case "Hide":
                    int hideNumber = Integer.parseInt(commands[1]);
                    if (numbers.contains(hideNumber)) {
                        int index = numbers.indexOf(hideNumber);
                        numbers.remove(index);
                    }
                    break;
                case "Switch":
                    int firstNum = Integer.parseInt(commands[1]);
                    int secondNum = Integer.parseInt(commands[2]);

                    if (numbers.contains(firstNum) && numbers.contains(secondNum)) {
                        int firstNumIndex = numbers.indexOf(firstNum);
                        int secondNumIndex = numbers.indexOf(secondNum);
                        numbers.remove(firstNumIndex);
                        numbers.add(firstNumIndex, secondNum);
                        numbers.remove(secondNumIndex);
                        numbers.add(secondNumIndex, firstNum);
                    }
                    break;
                case "Insert":
                    int place = Integer.parseInt(commands[1]);
                    int insertNum = Integer.parseInt(commands[2]);
                    if (numbers.size() >= place) {
                        numbers.add(place + 1, insertNum);
                    }
                    break;
                case "Reverse":
                    Collections.reverse(numbers);
                    break;
            }

            input = scanner.nextLine();
        }
        for (Integer num : numbers) {
            System.out.print(num + " ");
        }

    }
}
