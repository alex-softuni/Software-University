package Telephony;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> numbers = readSequenceOfStrings(reader);
        List<String> urls = readSequenceOfStrings(reader);

        Smartphone smartphone = new Smartphone(numbers, urls);

        System.out.println(smartphone.call());
        System.out.println(smartphone.browse());


    }

    private static List<String> readSequenceOfStrings(BufferedReader reader) throws IOException {
        return Arrays.stream(reader.readLine().split("\\s+")).collect(Collectors.toList());
    }
}
