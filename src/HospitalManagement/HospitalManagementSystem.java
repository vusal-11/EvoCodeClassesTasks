package HospitalManagement;

import java.time.LocalDate;

public class HospitalManagementSystem {
    public static void main(String[] args) {

        Doctor doctor = new Doctor("Vusal", 29, "MustafaVekilov", "Dantist", 3);
        Patient patient = new Patient("Xeyal", 30, "Pirmemmed", 101);

        AppointmentDetails appointment = new AppointmentDetails(1, patient, doctor, LocalDate.now());
        AppointmentScheduler scheduler = new AppointmentScheduler();
        scheduler.scheduleAppointment(appointment);

        System.out.println("Appointments for Doctor: " + scheduler.getAppointmentsForDoctor(doctor));
        System.out.println("Appointments for Patient: " + scheduler.getAppointmentsForPatient(patient));
    }
}
