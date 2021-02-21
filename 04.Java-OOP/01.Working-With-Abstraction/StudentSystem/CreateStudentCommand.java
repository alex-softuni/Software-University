package StudentSystem;

public class CreateStudentCommand {

    public static Student createStudent(String[] args) {
        String name = args[1];
        int age = Integer.parseInt(args[2]);
        double grade = Double.parseDouble(args[3]);
        return new Student(name,age,grade);
    }
}
