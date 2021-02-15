import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentsInfo = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!studentsInfo.containsKey(name)) {
                studentsInfo.put(name, new ArrayList<>());
                studentsInfo.get(name).add(grade);
            } else {
                studentsInfo.get(name).add(grade);
            }
        }
        Map<String, Double> filteredStudents = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> entry : studentsInfo.entrySet()) {
            double avgGrade = entry.getValue().stream().mapToDouble(x -> x)
                    .average().getAsDouble();
            if (avgGrade >= 4.50) {
                filteredStudents.put(entry.getKey(), avgGrade);
            }
        }

        filteredStudents.entrySet().stream()
                .sorted((g1, g2) -> g2.getValue().compareTo(g1.getValue()))
                .forEach(grade -> {
                    System.out.println(String.format("%s -> %.2f", grade.getKey(), grade.getValue()));
                });


    }
}