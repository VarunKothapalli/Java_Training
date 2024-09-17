package FourFiveDays;

public class ConcatenateStrings {

    public static String concatenateStrings (String str1, String str2) {
        return str1 + str2;
    }

    public static String concatenateStrings (String str1, String str2, String str3) {
        return str1 + str2 + str3;
    }


    public static void main (String [] args) {

        System.out.println("Concatenation of two Strings " + concatenateStrings("Java", " Programming"));

        System.out.println("Concatenation of three Strings " + concatenateStrings("Object", " Oriented" + " Programming"));
    }
}
