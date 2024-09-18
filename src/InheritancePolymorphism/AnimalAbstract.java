package InheritancePolymorphism;

public class AnimalAbstract {

    public static void main (String [] args) {

        Animal myDog = new Dog();
        myDog.makeSound();
        Animal myCat = new Cat();
        myCat.makeSound();
    }
}

abstract class Animal {

    public abstract void makeSound();
}

class Dog extends Animal {


    @Override
    public void makeSound() {
        System.out.println("Dog Barks: Woof Woof");
    }
}

class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Cat Meows: Meow Meow");
    }
}