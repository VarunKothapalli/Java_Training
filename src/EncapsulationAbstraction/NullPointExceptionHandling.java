package EncapsulationAbstraction;

public class NullPointExceptionHandling {

    public static void main(String[] args) {

        String str = null;
        try {
            System.out.println(str.length());
        }catch (NullPointerException exception) {
            System.out.println("Exception Caught: " + exception.getMessage());
        }
        System.out.println("Program is Continuing");
    }
}
