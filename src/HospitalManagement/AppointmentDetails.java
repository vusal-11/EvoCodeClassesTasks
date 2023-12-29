package HospitalManagement;
import java.time.LocalDate;

public class AppointmentDetails {
    private int appointmentID;
    private Patient patient;
    private Doctor doctor;

    private LocalDate appointmentDate;

    public AppointmentDetails(int appointmentID, Patient patient, Doctor doctor, LocalDate appointmentDate) {
        this.appointmentID = appointmentID;
        this.patient = patient;
        this.doctor = doctor;
        this.appointmentDate = appointmentDate;
    }

    public int getAppointmentID() { return appointmentID; }
    public Patient getPatient() { return patient; }
    public Doctor getDoctor() { return doctor; }
    public LocalDate getAppointmentDate() { return appointmentDate; }

    public String toString() {
        return "AppoinmentDetails{" +
                "appointmentID = " + appointmentID +
                ", patient=" + patient +
                ", doctor = " + doctor +
                ", appointmentDate = " + appointmentDate +
                '}';
    }
}
