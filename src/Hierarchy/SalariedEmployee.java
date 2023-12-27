package Hierarchy;

public class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, int id, double annualSalary, boolean isRetired) {
        super(name, id);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }
    public double getAnnualSalary() {
        return annualSalary;
    }
    public boolean isRetired() {
        return isRetired;
    }
    public void retire() {
        this.isRetired = true;
    }


}
