class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() { return name; }
    public int getAge() { return age; }
}

class Teacher extends Person {
    private String subject;
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
    public void displayRole() { System.out.println("Teacher: " + subject); }
}

class Student extends Person {
    private String grade;
    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }
    public void displayRole() { System.out.println("Student: " + grade); }
}

class Staff extends Person {
    private String department;
    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }
    public void displayRole() { System.out.println("Staff: " + department); }
}

public class SchoolSystemRoles {
    public static void main(String[] args) {
        Person[] people = {
            new Teacher("Alice", 30, "Math"),
            new Student("Bob", 15, "10th"),
            new Staff("Charlie", 40, "Admin")
        };
        for (Person p : people) {
            if (p instanceof Teacher) ((Teacher)p).displayRole();
            if (p instanceof Student) ((Student)p).displayRole();
            if (p instanceof Staff) ((Staff)p).displayRole();
        }
    }
}
