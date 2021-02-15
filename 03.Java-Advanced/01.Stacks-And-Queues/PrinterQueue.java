import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> printerQueue = new ArrayDeque<>();


        String input = scanner.nextLine();
        while (!input.equals("print")) {
            if (input.equals("cancel")) {
                if (!printerQueue.isEmpty()) {
                    System.out.println("Canceled " + printerQueue.poll());
                } else {
                    System.out.println("Printer is on standby");
                }
            }
            if (!input.equals("cancel") && !input.equals("print")) {
                printerQueue.offer(input);
            }
            input = scanner.nextLine();
        }

        for (String fileName : printerQueue) {
            System.out.println(fileName);
        }

    }
}
