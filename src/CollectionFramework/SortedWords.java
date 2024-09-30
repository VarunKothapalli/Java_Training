package CollectionFramework;

import java.util.*;

public class SortedWords {
    public static void main(String[] args) {
        Set<String> wordSet = new TreeSet<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Word or type(exit to stop: ");
        while (true){
            String word = scan.nextLine();
            if (word.equalsIgnoreCase("exit")){
                break;
            }
            wordSet.add(word);
        }
        //by default words in TreeSet will be in sorted order//
        System.out.println("Sorted Words: " + wordSet);

        scan.close();
    }
}
