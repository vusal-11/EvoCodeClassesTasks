package EasyTask;

public class Vehicle {
    private String model;
    private int year;

    public void runVehicle(){
        System.out.println("Vehicle Run");
    }

    public void fuelType(){
        System.out.println("Base fuel");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
