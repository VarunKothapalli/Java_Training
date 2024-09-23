package EncapsulationAbstraction;
import java.lang.*;
public class ArrayException {

    public static void main(String[] args) {
        // Initialize an array with 5 elements
        int[] numbers = new int[5];

        try {
            // Attempt to access the 6th element, which doesn't exist
            System.out.println("The 6th element in the array: " + numbers[5]);
        } catch (Exception exception) {
            // Handle the exception by printing an error message
            System.out.println("Exception caught " + exception.getMessage());
        }
        // Program continues to run normally
        System.out.println("Program execution continues...");
    }
}
