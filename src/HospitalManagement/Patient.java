package HospitalManagement;

import java.time.LocalDate;

public class Patient extends Person{

    private int patientID;

    public Patient(String name, int age, String address, int patientID) {
        super(name, age, address);
        this.patientID = patientID;
    }

    public int getPatientID()
    {
        return patientID;
    }
    public void setPatientID(int patientID) { this.patientID = patientID; }

    @Override
    public String toString() {
        return "Patient: " + getName() + ", ID: " + patientID;
    }
}
