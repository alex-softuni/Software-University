package CustomException;

public class Student {
    private String name;
    private String email;

    public Student(String name, String email) throws InvalidPersonNameException {
        this.setName(name);
        this.email = email;
    }

    public void setName(String name) throws InvalidPersonNameException {
        if (name.equals("4havdar")) {
            throw new InvalidPersonNameException("Invalid Name");
        }
        this.name = name;
    }
}
