import java.util.Scanner;
import java.util.*;

public class SumofDigits {

    public static void main(String[] args) {
        /* To get the number from the user*/
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Positive Interger: ");
        int num = scan.nextInt();
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num = (num/10);
        }
        System.out.println("sum of digits = " + sum);
    }
}
