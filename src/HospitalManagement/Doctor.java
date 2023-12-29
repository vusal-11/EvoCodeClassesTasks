package HospitalManagement;

public class Doctor extends Person{

    private String specialization;
    private int yearsOfExperience;

    public Doctor(String name, int age, String address, String specialization, int yearsOfExperience) {
        super(name, age, address);
        this.specialization = specialization;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }

    public int getYearsOfExperience() { return yearsOfExperience; }
    public void setYearsOfExperience(int yearsOfExperience) { this.yearsOfExperience = yearsOfExperience; }

    // Overriding toString method
    @Override
    public String toString() {
        return "Doctor: " + getName() + ", Specialization: " + specialization + ", Experience: " + yearsOfExperience + " years.";
    }
}
