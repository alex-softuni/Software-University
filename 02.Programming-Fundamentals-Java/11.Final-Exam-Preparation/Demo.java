import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Demo {
    static class Persons {
        String name;
        int health;
        int energy;

        public void setEnergy(int energy) {
            this.energy = energy;
        }

        public String getName() {
            return name;
        }

        public int getEnergy() {
            return energy;
        }

        public int getHealth() {
            return health;
        }

        public void setHealth(int health) {
            this.health = health;
        }

        public Persons(String name, int health, int energy) {
            this.name = name;
            this.health = health;
            this.energy = energy;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Persons> personInfo = new HashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("Results")) {
            String[] commands = input.split(":");

            switch (commands[0]) {
                case "Add":
                    String name = commands[1];

                    int health = Integer.parseInt(commands[2]);
                    int energy = Integer.parseInt(commands[3]);

                    Persons p = new Persons(name, health, energy);
                    if (personInfo.containsKey(name)) {
                        int currentHP = p.getHealth();
                        personInfo.get(name).setHealth(currentHP + p.getHealth());

                    } else {
                        personInfo.put(name, p);
                    }

                    break;
                case "Attack":
                    String atkName = commands[1];
                    String defName = commands[2];
                    int dmg = Integer.parseInt(commands[3]);
                    if (personInfo.containsKey(atkName) && personInfo.containsKey(defName)) {
                        Persons p1 = personInfo.get(defName);
                        Persons p2 = personInfo.get(atkName);

                        p1.setHealth(p1.getHealth() - dmg);
                        if (p1.getHealth() <= 0) {
                            System.out.println(p1.getName() + " was disqualified!");
                            personInfo.remove(p1.getName());
                        }

                        int currentEnergy = p2.getEnergy();
                        p2.setEnergy(currentEnergy - 1);
                        if (p2.getEnergy() <= 0) {
                            System.out.println(p2.getName() + " was disqualified!");
                            personInfo.remove(p2.getName());
                        }
                    }

                    break;
                case "Delete":
                    if (commands[1].equals("All")) {
                        personInfo.clear();
                    } else if (personInfo.containsKey(commands[1])) {
                        personInfo.remove(commands[1]);
                    }
                    break;
                default:
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.println("People count: " + personInfo.size());
        personInfo.values()
                .stream()
                .sorted((a, b) -> {
                    int res = Integer.compare(b.getHealth(), a.getHealth());
                    if (res == 0) {
                        int str = a.getName().compareTo(b.getName());
                        return str;
                    } else {
                        return res;
                    }
                })
                .map(s -> s.getName() + " - " + s.getHealth() + " - " + s.getEnergy())
                .forEach(s -> System.out.println(s));
    }
}
