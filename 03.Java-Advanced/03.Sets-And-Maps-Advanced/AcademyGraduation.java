package Lab;

import java.text.DecimalFormat;
import java.util.*;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStudents = Integer.parseInt(scanner.nextLine());

        Map<String, double[]> studentsInfo = new TreeMap<>();

        while (numberOfStudents-- > 0) {
            String name = scanner.nextLine();
            double[] grade = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToDouble(Double::parseDouble).toArray();
            studentsInfo.putIfAbsent(name, grade);
        }
        DecimalFormat df = new DecimalFormat("#.##########");

        studentsInfo.entrySet()
                .forEach(s -> {
                    String name = s.getKey();
                    double average = Arrays.stream(s.getValue()).average().orElse(0);
                    System.out.println(String.format("%s is graduated with %s", name,df.format(average) ));
                });
    }



}