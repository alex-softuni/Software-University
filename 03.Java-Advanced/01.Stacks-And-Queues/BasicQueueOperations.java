import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputData = scanner.nextLine().split("\\s+");
         // count numbers to add
        int n = Integer.parseInt(inputData[0]);
        // count numbers to poll
        int s = Integer.parseInt(inputData[1]);
        // check whether number is in the Queue
        int x = Integer.parseInt(inputData[2]);

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            queue.offer(scanner.nextInt());
        }
        for (int i = 0; i < s; i++) {
            queue.poll();
        }
        if (queue.contains(x)){
            System.out.println("true");
        } else if (!queue.isEmpty()){
            System.out.println(Collections.min(queue));
        } else {
            System.out.println("0");
        }

    }
}
