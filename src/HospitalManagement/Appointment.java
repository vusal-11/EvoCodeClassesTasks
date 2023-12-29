package HospitalManagement;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Appointment {

    private List<AppointmentDetails> appointments = new ArrayList<>();

    public List<AppointmentDetails> getAppointments() { return appointments; }

    public void setAppointments(List<AppointmentDetails> appointments) {
        this.appointments = appointments;
    }
}
