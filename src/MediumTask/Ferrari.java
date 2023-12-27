package MediumTask;

import EasyTask.Car;
import abcd.C;

public class Ferrari extends Car {

    private boolean isActiveTurbo;


    public boolean isActiveTurbo() {
        return isActiveTurbo;
    }

    public void setActiveTurbo(boolean activeTurbo) {
        isActiveTurbo = activeTurbo;
    }
    public void activateTurbo(){
        isActiveTurbo=true;
        super.set_speed(increaseSpeed(20));
    }

    public void deactivateTurbo(){
        isActiveTurbo=false;
        super.increaseSpeed(20);
    }






}
