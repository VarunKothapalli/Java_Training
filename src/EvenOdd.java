import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        /* To get the number from the user*/
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = scan.nextInt();
        System.out.print("Select Odd or Even numbers you want to display: ");
        /* To get the odd or even from the user*/
        Scanner scanOddEven = new Scanner(System.in);
        String oddEven = scanOddEven.nextLine();
        /* Converting character to lower cases */
        String word = oddEven.toLowerCase();

        if (word.equals("odd")) {
            System.out.println("Odd Numbers in the given number Range: ");
            for(int i = 1; i <= num; i++) {
                if ((i % 2) != 0)
                    System.out.print(i + " ");
            }
        }
        else if (word.equals("even")) {
            System.out.println("Even Numbers in the given number Range: ");
            for (int i = 1; i <= num; i++) {
                if ((i % 2) == 0)
                    System.out.print(i + " ");
            }
        }
        else {
            System.out.println("Please enter a valid input");
        }

    }
}