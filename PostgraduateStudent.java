public class PostgraduateStudent extends Student {
    private String specialization;

    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber); // public
        System.out.println("Name: " + name); // protected
        System.out.println("Specialization: " + specialization);
        System.out.println("CGPA: " + getCGPA()); // private via getter
    }
}