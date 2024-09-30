package CollectionFramework;

import java.util.*;

public class RemovingDuplicates {


        public static List<Integer> removeDuplicates(List<Integer> list) {
            Set<Integer> set = new HashSet<>(list);  // Using HashSet to remove duplicates
            return new ArrayList<>(set);  // Converting Set back to List
        }

    public static void main(String[] args) {
            List<Integer> numbers = new ArrayList<>();
            numbers.add(1);
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
            numbers.add(3);
            numbers.add(4);
            numbers.add(5);
            numbers.add(5);

            List<Integer> uniqueNumbers = removeDuplicates(numbers);

        System.out.println("Unique Numbers: " + uniqueNumbers);


    }
}
