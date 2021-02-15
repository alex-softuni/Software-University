import java.util.Scanner;

public class E03Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        int elevatorCapacity = Integer.parseInt(scanner.nextLine());

    int courses = (int) Math.ceil((double)numberOfPeople / elevatorCapacity);

        System.out.println(courses);

    }
}
