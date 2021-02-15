package CompanyRoster;

import java.util.*;

public class Department {
    private String name;
    private final List<Employee> employeeList;

    public Department() {
        this.employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        this.employeeList.add(employee);
    }

    public List<Employee> getEmployeeList() {
        return Collections.unmodifiableList(this.employeeList);
    }

    public double getAverageSalary() {
        double avgSalary = 0.0;
        for (Employee employee : this.employeeList) {
            avgSalary += employee.getSalary();
        }

        return avgSalary / this.employeeList.size();
    }
}
