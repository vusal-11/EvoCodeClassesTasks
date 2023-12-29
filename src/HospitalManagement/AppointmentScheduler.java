package HospitalManagement;

import java.util.ArrayList;
import java.util.List;

public class AppointmentScheduler {

    private Appointment appointment = new Appointment();

    public List<AppointmentDetails> scheduleAppointment(AppointmentDetails appointmentDetails) {
        appointment.getAppointments().add(appointmentDetails);
        return appointment.getAppointments();
    }

    public List<AppointmentDetails> cancelAppointment(AppointmentDetails appointmentDetails) {
        appointment.getAppointments().remove(appointmentDetails);
        return appointment.getAppointments();
    }

    public List<AppointmentDetails> getAppointmentsForDoctor(Doctor doctor) {
        List<AppointmentDetails> doctorAppointments = new ArrayList<>();
        for (AppointmentDetails appointment : appointment.getAppointments()) {
            if (appointment.getDoctor().equals(doctor)) {
                doctorAppointments.add(appointment);
            }
        }
        return doctorAppointments;
    }

    public List<AppointmentDetails> getAppointmentsForPatient(Patient patient) {
        List<AppointmentDetails> patientAppointments = new ArrayList<>();
        for (AppointmentDetails appointment : appointment.getAppointments()) {
            if (appointment.getPatient().equals(patient)) {
                patientAppointments.add(appointment);
            }
        }
        return patientAppointments;
    }
}
