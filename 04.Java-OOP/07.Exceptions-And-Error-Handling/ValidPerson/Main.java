package ValidPerson;

public class Main {
    public static void main(String[] args) {

        try {
            // Person test = new Person(null, "Aimee", 19);
            // Person test2 = new Person("Alex", null, 19);
            // Person test3 = new Person("Alex", "Atanasov", -21);
            // Person test4 = new Person("Alex", "Atanasov", 121);

        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
