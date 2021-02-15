import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderByAge {
    static class Person {
        String name;
        String ID;
        int age;

        public String getName() {
            return name;
        }

        public String getID() {
            return ID;
        }

        public int getAge() {
            return age;
        }

        public Person(String name, String ID, int age) {
            this.name = name;
            this.ID = ID;
            this.age = age;
        }

        @Override
        public String toString() {
            return String.format("%s with ID: %s is %d years old.",
                    getName(), getID(), getAge());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> allPersons = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] data = input.split(" ");

            Person person = new Person(data[0], data[1], Integer.parseInt(data[2]));
            allPersons.add(person);

            input = scanner.nextLine();
        }
        allPersons.stream()
                .sorted((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()))
                .forEach(person -> System.out.println(person.toString()));
    }
}
