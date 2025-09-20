package ObjectRelationAndModelling;
import java.util.ArrayList;
import java.util.List;

class Doctor {
    private String name;
    private List<Patient> patients = new ArrayList<>();
    public Doctor(String name) { this.name = name; }
    public void consult(Patient p) {
        patients.add(p);
        p.addDoctor(this);
        System.out.println(name + " consults " + p.getName());
    }
    public String getName() { return name; }
    public List<Patient> getPatients() { return patients; }
}

class Patient {
    private String name;
    private List<Doctor> doctors = new ArrayList<>();
    public Patient(String name) { this.name = name; }
    public void addDoctor(Doctor d) { doctors.add(d); }
    public String getName() { return name; }
    public List<Doctor> getDoctors() { return doctors; }
}

class Hospital {
    private String name;
    private List<Doctor> doctors = new ArrayList<>();
    private List<Patient> patients = new ArrayList<>();
    public Hospital(String name) { this.name = name; }
    public void addDoctor(Doctor d) { doctors.add(d); }
    public void addPatient(Patient p) { patients.add(p); }
    public List<Doctor> getDoctors() { return doctors; }
    public List<Patient> getPatients() { return patients; }
}

public class HospitalDoctorsPatients {
    public static void main(String[] args) {
        Hospital h = new Hospital("City Hospital");
        Doctor d1 = new Doctor("Dr. Smith");
        Doctor d2 = new Doctor("Dr. Lee");
        Patient p1 = new Patient("Alice");
        Patient p2 = new Patient("Bob");
        h.addDoctor(d1);
        h.addDoctor(d2);
        h.addPatient(p1);
        h.addPatient(p2);
        d1.consult(p1);
        d2.consult(p1);
        d2.consult(p2);
    }
}
