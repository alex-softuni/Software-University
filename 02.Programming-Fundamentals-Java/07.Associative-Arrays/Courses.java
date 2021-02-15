import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> courses = new LinkedHashMap<>();

        String[] data = scanner.nextLine().split(" : ");
        while (!data[0].equals("end")) {
            String course = data[0];
            String studentName = data[1];

            if (!courses.containsKey(course)) {
                courses.put(course, new ArrayList<>());
                courses.get(course).add(studentName);
            } else {
                courses.get(course).add(studentName);
            }

            data = scanner.nextLine().split(" : ");
        }


        courses.entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getValue().size() - e1.getValue().size())
                .forEach(e -> {
                    System.out.printf("%s: %s%n", e.getKey().trim(), e.getValue().size());
                    e.getValue()
                            .stream().sorted((f, s) -> f.compareTo(s))
                            .forEach(v -> System.out.println("-- " + v));

                });
    }
}