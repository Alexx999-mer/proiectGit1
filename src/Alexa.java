

import java.util.ArrayList;
import java.util.List;

public class Alexa {

    List<Electronics> myElectronics = new ArrayList<>();

    public Alexa() {

    }

    public List<Electronics> addDevice(Electronics electronicDevice) {
        myElectronics.add(electronicDevice);
        String message = String.format("New %s device has been registered!", electronicDevice.getType());
        System.out.println(message);
        return this.myElectronics;
    }

    public void turnOn() {

    }

    public void printDevices() {

    }

    public void removeDevice(CoffeeMachine coffee) {

    }

    public void turnOn(TV tvPhi) {

    }

    public void turnOn(AirConditioner air) {

    }
}

