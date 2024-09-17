package InheritancePolymorphism;

public class StartEngine {

    public static void main(String[] args) {

        Vehicle myVehicle = new Vehicle();

        Car myCar = new Car();

        myVehicle.startEngine();
        myCar.startEngine();

        Vehicle myNewVehicle = new Car();
        myNewVehicle.startEngine();
    }
}

class Vehicle {

    public void startEngine() {
        System.out.println("The vehicle's engine is starting.");
    }
}

class Car extends Vehicle {

    public void startEngine() {
        System.out.println("The car's engine is starting with a roar.");
    }
}