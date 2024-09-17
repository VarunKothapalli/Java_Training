import java.util.Scanner;

public class VowelConstant {

    public static void main(String[] args) {
        /* To get the number from the user*/
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Character: ");
        String character = scan.next();
        String word = character.toLowerCase();
        switch (word) {
            case "a":
                System.out.println(word + " is Vowel character");
                break;
            case "e":
                System.out.println(word + " is Vowel character");
                break;
            case "i":
                System.out.println(word + " is Vowel character");
                break;
            case "o":
                System.out.println(word + " is Vowel character");
                break;
            case "u":
                System.out.println(word + " is Vowel character");
                break;
            default:
                System.out.println(word + " is a constant character");
        }


    }
}
