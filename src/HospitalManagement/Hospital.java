package HospitalManagement;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private List<Doctor> doctors = new ArrayList<>();
    private List<Patient> patients = new ArrayList<>();

    public void addDoctor(Doctor doctor) { doctors.add(doctor); }
    public void addPatient(Patient patient) { patients.add(patient); }

    public List<Doctor> getDoctors() { return doctors; }
    public List<Patient> getPatients() { return patients; }
}
