package Lab;

import java.util.*;

public class AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, ArrayList<Double>> studentsInfo = new TreeMap<>();

        while (n-- > 0) {
            String[] data = scanner.nextLine().split("\\s+");
            String name = data[0];
            double grade = Double.parseDouble(data[1]);
            studentsInfo.putIfAbsent(name, new ArrayList<>());
            studentsInfo.get(name).add(grade);

        }
      studentsInfo.entrySet()
              .stream()
              .forEach(pair -> {
                  System.out.print(pair.getKey() + " -> ");
                  double sum = 0;
                  for (Double grade : pair.getValue()) {
                      sum += grade;
                      System.out.printf( "%.2f ",grade);
                  }
                  double avgGrade = sum / pair.getValue().size();
                  System.out.printf("(avg: %.2f)",avgGrade);
                  System.out.println();
              });
    }
}
