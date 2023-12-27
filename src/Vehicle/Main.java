package Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Vehicle("Toyota Camry", 2020);

        myCar.displayInfo();

        myCar.start();
        myCar.accelerate(50);

        myCar.stop();
    }
}
