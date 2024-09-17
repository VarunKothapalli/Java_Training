package FourFiveDays;

public class FindingMiddleChar {

    public static String middleCharacter (String str) {

        int len = str.length();
        int middle = len/2;

        if(len % 2 != 0) {
            return String.valueOf(str.charAt(middle));
        }
        else {
            return str.substring(middle-1, middle+1);
        }
    }

    public static String middleCharacter (char[] charArray) {

        int len = charArray.length;
        int middle = len/2;

        if(len % 2 != 0) {
            return  String.valueOf(charArray[middle]);
        }
        else {
            return String.valueOf(charArray[middle-1]) + String.valueOf(charArray[middle]);
        }

    }

    public static void main (String [] args) {

        System.out.println("Middle Character of Varun: " + middleCharacter("Varun"));
        System.out.println("Middle Character of Kothapalli: " + middleCharacter("Kothapalli"));


        char [] testArray1 = {'a', 'b', 'c', 'd', 'e'};
        char [] testArray2 = {'a', 'b', 'c', 'd'};

        System.out.println("Middle Character of {'a', 'b', 'c', 'd', 'e'}: " + middleCharacter(testArray1));
        System.out.println("Middle Character of {'a', 'b', 'c', 'd'}: " + middleCharacter(testArray2));

    }
}
