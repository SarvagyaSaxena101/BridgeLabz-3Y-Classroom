package ObjectRelationAndModelling;
import java.util.ArrayList;
import java.util.List;

class Faculty {
    private String name;
    public Faculty(String name) { this.name = name; }
    public String getName() { return name; }
}

class Department {
    private String name;
    private List<Faculty> faculties = new ArrayList<>();
    public Department(String name) { this.name = name; }
    public void addFaculty(Faculty f) { faculties.add(f); }
    public String getName() { return name; }
    public List<Faculty> getFaculties() { return faculties; }
}

class University {
    private String name;
    private List<Department> departments = new ArrayList<>();
    public University(String name) { this.name = name; }
    public void addDepartment(Department d) { departments.add(d); }
    public List<Department> getDepartments() { return departments; }
}

public class UniversityFacultiesDepartments {
    public static void main(String[] args) {
        University uni = new University("XYZ University");
        Department d1 = new Department("CS");
        Faculty f1 = new Faculty("Alice");
        Faculty f2 = new Faculty("Bob");
        d1.addFaculty(f1);
        uni.addDepartment(d1);
        System.out.println("University: " + uni.getDepartments().get(0).getName());
        for (Faculty f : d1.getFaculties()) {
            System.out.println("Faculty: " + f.getName());
        }
        Faculty f3 = new Faculty("Charlie");
        System.out.println("Independent Faculty: " + f3.getName());
    }
}
