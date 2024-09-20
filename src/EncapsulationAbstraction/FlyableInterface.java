package EncapsulationAbstraction;

public class FlyableInterface {


    public static void main (String [] args) {

        Flyable f1 = new Airplane();
        f1.flyable();
    }
}


interface Flyable {

    public void fly();

    default void flyable () {
        System.out.println("flyable");
    }
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
        System.out.println("Airplane is taking off from the terminal ");
    }
}