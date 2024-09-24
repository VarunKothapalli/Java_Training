package EncapsulationAbstraction;

import java.util.*;

public class InvalidAge {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a valid age: ");
        int userAge = scan.nextInt();

        ageverification age = new ageverification();

        try {
            age.checkAge(userAge);
        } catch (invalidAgeException exception) {
            System.out.println("Exception caught: " + exception.getMessage());
        }
        System.out.println("Program execution continues....");
    }

}

class ageverification {

    public void checkAge (int age) {
            if (age < 18) {
                throw new invalidAgeException("Age is below 18, You are not eligible");
            } else {
                System.out.println("Age is valid. You are eligible");
            }
    }
}

class invalidAgeException extends RuntimeException {

    public invalidAgeException (String message) {

        super(message.toUpperCase());
    }
}




