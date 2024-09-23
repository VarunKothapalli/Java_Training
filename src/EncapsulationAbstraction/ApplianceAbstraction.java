package EncapsulationAbstraction;

public class ApplianceAbstraction {

    public static void main(String[] args) {
        Appliance myWasher = new WashingMachine();
        myWasher.turnOn();
        Appliance myrefrigerator = new Refrigerator();
        myrefrigerator.turnOn();

    }
}

abstract class Appliance {

    abstract void turnOn ();
}

class WashingMachine extends Appliance {


    @Override
    public void turnOn() {
        System.out.println("Washing is turned on and running");
    }
}

class Refrigerator extends Appliance {
    @Override
    public void turnOn() {
        System.out.println("Refrigerator is turned on and running");
    }

}