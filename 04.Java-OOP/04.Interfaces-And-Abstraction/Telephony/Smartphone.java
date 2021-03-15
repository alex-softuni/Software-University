package Telephony;

import java.util.List;

public class Smartphone implements Callable, Browsable {
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }


    @Override
    public String browse() {
        StringBuilder sb = new StringBuilder();
        for (String url : this.urls) {
            if (containsDigit(url)) {
                sb.append("Invalid URL!");
            } else {
                sb.append("Browsing: ").append(url).append("!");
            }
            sb.append(System.lineSeparator());
        }
        return sb.toString().trim();
    }

    @Override
    public String call() {
        StringBuilder sb = new StringBuilder();
        for (String number : this.numbers) {
            if (containsNonDigit(number)) {
                sb.append("Invalid number!");
            } else {
                sb.append("Calling... ").append(number);
            }
            sb.append(System.lineSeparator());
        }
        return sb.toString().trim();
    }

    private boolean containsNonDigit(String number) {
        for (char symbol : number.toCharArray()) {
            if (!Character.isDigit(symbol)) {
                return true;
            }
        }
        return false;
    }

    private boolean containsDigit(String url) {
        for (char symbol : url.toCharArray()) {
            if (Character.isDigit(symbol)) {
                return true;
            }
        }
        return false;
    }


}
