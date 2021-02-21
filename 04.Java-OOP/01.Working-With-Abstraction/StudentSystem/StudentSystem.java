package StudentSystem;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class StudentSystem {
    private Map<String, Student> studentsByName;

    public StudentSystem() {
        this.studentsByName = new HashMap<>();
    }

    public Map<String, Student> getStudentsByName() {
        return this.studentsByName;
    }

    public String parseCommand(String[] args) {
        String result = null;
        if (args[0].equals("Create")) {
            Student student = CreateStudentCommand.createStudent(args);
            studentsByName.putIfAbsent(student.getName(), student);
        } else if (args[0].equals("Show")) {
            String name = args[1];
            Student student = studentsByName.get(name);
            result = student != null ? student.toString() : null;
        } else {
            result = "Exit";
        }
        return result;
    }
}


