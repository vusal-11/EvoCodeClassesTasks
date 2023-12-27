package Hierarchy;

public class Main {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("Vusal", 123, 50000, false);
        System.out.println(salariedEmployee.getName() + " isRetired: " + salariedEmployee.isRetired());
        salariedEmployee.retire();
        System.out.println(salariedEmployee.getName() + " isRetired: " + salariedEmployee.isRetired());

    }
}
