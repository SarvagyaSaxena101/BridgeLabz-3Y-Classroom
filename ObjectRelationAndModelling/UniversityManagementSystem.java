package ObjectRelationAndModelling;
import java.util.ArrayList;
import java.util.List;

class Professor {
    private String name;
    public Professor(String name) { this.name = name; }
    public String getName() { return name; }
}

class Student {
    private String name;
    private List<Course> courses = new ArrayList<>();
    public Student(String name) { this.name = name; }
    public void enrollCourse(Course c) { courses.add(c); c.addStudent(this); }
    public String getName() { return name; }
    public List<Course> getCourses() { return courses; }
}

class Course {
    private String name;
    private Professor professor;
    private List<Student> students = new ArrayList<>();
    public Course(String name) { this.name = name; }
    public void assignProfessor(Professor p) { professor = p; }
    public void addStudent(Student s) { students.add(s); }
    public String getName() { return name; }
    public Professor getProfessor() { return professor; }
    public List<Student> getStudents() { return students; }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Professor prof = new Professor("Dr. Smith");
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");
        Course c1 = new Course("Math");
        c1.assignProfessor(prof);
        s1.enrollCourse(c1);
        s2.enrollCourse(c1);
        System.out.println("Course: " + c1.getName() + ", Professor: " + c1.getProfessor().getName());
        for (Student s : c1.getStudents()) {
            System.out.println("Student: " + s.getName());
        }
    }
}
