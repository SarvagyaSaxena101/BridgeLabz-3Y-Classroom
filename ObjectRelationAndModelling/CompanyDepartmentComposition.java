package ObjectRelationAndModelling;

import java.util.ArrayList;
import java.util.List;

class Employee {
    private String name;
    public Employee(String name) { this.name = name; }
    public String getName() { return name; }
}

class Department {
    private String name;
    private List<Employee> employees = new ArrayList<>();
    public Department(String name) { this.name = name; }
    public void addEmployee(Employee e) { employees.add(e); }
    public List<Employee> getEmployees() { return employees; }
    public String getName() { return name; }
}

class Company {
    private String name;
    private List<Department> departments = new ArrayList<>();
    public Company(String name) { this.name = name; }
    public void addDepartment(Department d) { departments.add(d); }
    public List<Department> getDepartments() { return departments; }
    public String getName() { return name; }
}

public class CompanyDepartmentComposition {
    public static void main(String[] args) {
        Company comp = new Company("TechCorp");
        Department d1 = new Department("IT");
        d1.addEmployee(new Employee("Alice"));
        d1.addEmployee(new Employee("Bob"));
        comp.addDepartment(d1);
        for (Department d : comp.getDepartments()) {
            System.out.println(comp.getName() + " has department: " + d.getName());
            for (Employee e : d.getEmployees()) {
                System.out.println("  Employee: " + e.getName());
            }
        }
    }
}
