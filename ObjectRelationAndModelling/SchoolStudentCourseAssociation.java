package ObjectRelationAndModelling;
import java.util.ArrayList;
import java.util.List;

class Course {
    private String name;
    private List<Student> students = new ArrayList<>();
    public Course(String name) { this.name = name; }
    public void addStudent(Student s) { students.add(s); }
    public String getName() { return name; }
    public List<Student> getStudents() { return students; }
}

class Student {
    private String name;
    private List<Course> courses = new ArrayList<>();
    public Student(String name) { this.name = name; }
    public void enroll(Course c) { courses.add(c); c.addStudent(this); }
    public String getName() { return name; }
    public List<Course> getCourses() { return courses; }
}

class School {
    private String name;
    private List<Student> students = new ArrayList<>();
    public School(String name) { this.name = name; }
    public void addStudent(Student s) { students.add(s); }
    public List<Student> getStudents() { return students; }
}

public class SchoolStudentCourseAssociation {
    public static void main(String[] args) {
        School school = new School("ABC School");
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");
        Course c1 = new Course("Math");
        Course c2 = new Course("Science");
        s1.enroll(c1);
        s1.enroll(c2);
        s2.enroll(c2);
        school.addStudent(s1);
        school.addStudent(s2);
        for (Student s : school.getStudents()) {
            System.out.print(s.getName() + " enrolled in: ");
            for (Course c : s.getCourses()) {
                System.out.print(c.getName() + " ");
            }
            System.out.println();
        }
        for (Course c : new Course[]{c1, c2}) {
            System.out.print(c.getName() + " students: ");
            for (Student st : c.getStudents()) {
                System.out.print(st.getName() + " ");
            }
            System.out.println();
        }
    }
}
