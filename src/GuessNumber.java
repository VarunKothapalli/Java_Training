import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        /* To get the number from the user*/
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number in b/w 1 to 10: ");
        int guessNumber = scan.nextInt();
        Random ran = new Random();
        int num = ran.nextInt(1, 11);
        do {
            if (guessNumber == num) {
                System.out.println("Congratulations! You guessed the correct number: " + guessNumber);
            }
            else {
                Scanner scanAgain = new Scanner(System.in);
                System.out.print("Your guess is wrong choose a number again in b/w 1 to 10: ");
                guessNumber = scanAgain.nextInt();
                if (guessNumber == num) {
                    System.out.println("Congratulations! You guessed the correct number: " + guessNumber);
                }
            }
        }
        while (guessNumber != num);
    }
}
