package CollectionFramework;

import java.util.HashMap;
import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        //Creating Hashmap
        HashMap<String, String> studentGrades = new HashMap<>();

        studentGrades.put("Varun", "A");
        studentGrades.put("Lavanya", "A");
        studentGrades.put("Charan", "A+");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name to get their grade: ");
        String name = scanner.nextLine();

        String grade = studentGrades.getOrDefault(name, "Name not found");
        System.out.println("Grade of " + name + ": " + grade);

        scanner.close();
    }
}

