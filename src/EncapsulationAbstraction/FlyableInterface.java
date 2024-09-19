package EncapsulationAbstraction;

public class FlyableInterface {


    public static void main (String [] args) {

    }
}


interface Flyable {

    public void fly();
}

class Bird implements Flyable {

    @Override

    public void fly() {
        System.out.println("Bird is flying");
    }
}

class Airplane implements Flyable {

    @Override
    public void fly() {
        System.out.println("Airplane is taking off from the terminal");
    }
}