import java.util.Scanner;
import java.util.logging.SocketHandler;

public class NumberCheck {

    public static void main(String[] args) {
        /* To get the number from the user*/
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = scan.nextInt();

        if (num > 0) {
            System.out.println("Entered Number is Positive");
        }
        else if (num < 0) {
            System.out.println("Entered Number is Negative");
        }
        else {
            System.out.println("Entered Number is 0");
        }
    }
}
