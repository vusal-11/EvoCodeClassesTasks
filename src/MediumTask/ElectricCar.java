package MediumTask;

import EasyTask.Car;

public class ElectricCar extends Car {


    private String batteryType;

    public String getBatteryType() {
        return batteryType;
    }

    public void setBatteryType(String batteryType) {
        this.batteryType = batteryType;
    }


    public void chargingTime(){
        System.out.println("This tesla need 1 hour to charge");
    }

    public void showCarFromElectric(){
        super.fuelType();
    }

    public void showVehicleFromElectric(){
        super.runVehicle();
    }


}
