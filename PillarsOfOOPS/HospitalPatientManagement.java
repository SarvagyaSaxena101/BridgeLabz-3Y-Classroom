package PillarsOfOOPS;

abstract class Patient {
    private String patientId;
    private String name;
    private int age;
    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }
    public String getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public abstract double calculateBill();
    public String getPatientDetails() { return patientId + ", " + name + ", " + age; }
}

interface MedicalRecord {
    void addRecord(String record);
    String viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private double roomCharges;
    private String records = "";
    public InPatient(String patientId, String name, int age, double roomCharges) {
        super(patientId, name, age);
        this.roomCharges = roomCharges;
    }
    public double calculateBill() { return roomCharges * 5; }
    public void addRecord(String record) { records += record + ";"; }
    public String viewRecords() { return records; }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private String records = "";
    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }
    public double calculateBill() { return consultationFee; }
    public void addRecord(String record) { records += record + ";"; }
    public String viewRecords() { return records; }
}

public class HospitalPatientManagement {
    public static void main(String[] args) {
        Patient[] patients = new Patient[2];
        patients[0] = new InPatient("P1", "Alice", 30, 2000);
        patients[1] = new OutPatient("P2", "Bob", 25, 500);
        for (Patient p : patients) {
            System.out.println(p.getPatientDetails() + " Bill: " + p.calculateBill());
        }
    }
}
