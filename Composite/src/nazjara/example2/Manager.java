package nazjara.example2;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {

    private List<Employee> employeeList = new ArrayList<>();

    private String name;
    private double salary;

    public Manager(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println("==============================");
        System.out.println("Name = " + getName());
        System.out.println("Salary = " + getSalary());
        System.out.println("------------------------------");
        employeeList.forEach(Employee::showEmployeeDetails);
    }

    public Employee getChild(int i) {
        return employeeList.get(i);
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employeeList.remove(employee);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
