import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MyProject {
    static class Guest {
        String name;
        String familyName;
        int age;
        String city;
        int roomNumber;
        String PIN;
        int totalStay;


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getFamilyName() {
            return familyName;
        }

        public void setFamilyName(String familyName) {
            this.familyName = familyName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public int getRoomNumber() {
            return roomNumber;
        }

        public void setRoomNumber(int roomNumber) {
            this.roomNumber = roomNumber;
        }

        public String getPIN() {
            return PIN;
        }

        public void setPIN(String PIN) {
            this.PIN = PIN;
        }

        public int getTotalStay() {
            return totalStay;
        }

        public void setTotalStay(int totalStay) {
            this.totalStay = totalStay;
        }

        public Guest(String name, String familyName, int age, String city, int roomNumber, String PIN, int totalStay) {
            this.name = name;
            this.familyName = familyName;
            this.age = age;
            this.city = city;
            this.roomNumber = roomNumber;
            this.PIN = PIN;
            this.totalStay = totalStay;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Guest> allGuests = new LinkedHashMap<>();

        System.out.println("Fill guest information below:");
        System.out.print("Enter name: ");
        String name = scanner.nextLine().toUpperCase();
        while (!isValid(name)) {
            System.out.print("Entered name is not valid! ");
            System.out.println("Please use only letters!");
            System.out.print("Enter name: ");
            name = scanner.nextLine();
        }

        System.out.print("Enter family Name: ");
        String familyName = scanner.nextLine().toUpperCase();
        while (!isValid(familyName)) {
            System.out.print("Entered name is not valid! ");
            System.out.println("Please use only letters!");
            System.out.print("Enter name: ");
           familyName = scanner.nextLine();
        }

        System.out.print("Enter city: ");
        String city = scanner.nextLine().toUpperCase();
        while (!isValid(city)) {
            System.out.print("Entered name is not valid! ");
            System.out.println("Please use only letters!");
            System.out.print("Enter name: ");
           city = scanner.nextLine();
        }

        System.out.print("Enter age: ");
        int age = Integer.parseInt(scanner.nextLine());
        while (!isAgeValid(age)) {
            System.out.print("Please enter valid age: ");
            age = Integer.parseInt(scanner.nextLine());
        }

        System.out.print("Enter room number: ");
        int roomNumber = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter PIN: ");
        String PIN = scanner.nextLine();
        while (!isPinValid(PIN)) {
            System.out.print("Invalid PIN: Valid PIN length is 10 digit. Contains only Digits!");
            System.out.print("\nPlease try again: ");
            PIN = scanner.nextLine();
        }


        System.out.print("Enter period of staying: ");
        int totalStay = Integer.parseInt(scanner.nextLine());

        Guest newGuest = new Guest(name, familyName, age, city, roomNumber, PIN, totalStay);
        if (!allGuests.containsKey(name)) {
            allGuests.put(name, newGuest);
        }

        String command = scanner.nextLine();
        if (command.equals("Admin Menu")) {
            command = scanner.nextLine();
            while (!command.equals("END")) {


                command = scanner.nextLine();
            }
        }
    }

    private static boolean isPinValid(String pin) {
        if (pin.length() != 10) {
            return false;
        }
        return true;
    }

    private static boolean isAgeValid(int age) {

        if (age <= 0 || age > 120) {
            return false;
        }
        return true;
    }

    static boolean isValid(String name) {
        boolean isValid = true;
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (!Character.isLetter(ch)) {
                isValid = false;
                break;
            }
        }
        return isValid;
    }
}
