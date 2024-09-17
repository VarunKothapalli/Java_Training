package FourFiveDays;
import java.util.*;

public class PrintInfo {
    public static void printInfo (String info) {
        System.out.println("String Info: " + info);
    }

    public static void printInfo (int info) {
        System.out.println("Int Info: " + info);
    }


    public static void  main (String [] args) {

        printInfo("Hello, Varun!");
        printInfo(28);
    }
}
