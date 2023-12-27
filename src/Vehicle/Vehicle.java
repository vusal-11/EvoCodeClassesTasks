package Vehicle;

public class Vehicle {
    private String model;
    private int year;
    private int currentSpeed;
    private boolean isRunning;
    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
        this.currentSpeed = 0;
        this.isRunning = false;
    }

    public void start() {
        if (!isRunning) {
            isRunning = true;
            System.out.println(model + " has started.");
        } else {
            System.out.println(model + " is already running.");
        }
    }

    public void stop() {
        if (isRunning) {
            isRunning = false;
            this.currentSpeed = 0;
            System.out.println(model + " has stopped.");
        } else {
            System.out.println(model + " is already stopped.");
        }
    }

    public void accelerate(int speedIncrement) {
        if (isRunning) {
            this.currentSpeed += speedIncrement;
            System.out.println(model + " is accelerating. Current speed: " + this.currentSpeed + " km/h");
        } else {
            System.out.println(model + " needs to be started before accelerating.");
        }
    }

    public void displayInfo() {
        System.out.println("Model: " + this.model);
        System.out.println("Year: " + this.year);
        System.out.println("Current speed: " + this.currentSpeed + " km/h");
        System.out.println("Is running: " + (isRunning ? "Yes" : "No"));
    }


}
