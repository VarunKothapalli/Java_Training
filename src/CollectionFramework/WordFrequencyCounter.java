package CollectionFramework;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequencyCounter {

    // Method to count word frequency in a given sentence
    public static Map<String, Integer> countWordFrequency(String sentence) {
        Map<String, Integer> wordCountMap = new HashMap<>();

        String[] words = sentence.split("\\s+");
        System.out.println(words);

        // Iterate over each word
        for (String word : words) {
            word = word.toLowerCase(); // Convert to lowercase for case-insensitive counting
            if (wordCountMap.containsKey(word)) {
                // If the word is already in the map, increase its count
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                // If the word is not in the map, add it with a count of 1
                wordCountMap.put(word, 1);
            }
        }

        return wordCountMap;
    }

    // Method to print each word and its frequency
    public static void printWordFrequency(Map<String, Integer> wordCountMap) {
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println("Word: " + entry.getKey() + " | Frequency: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        // Get the sentence from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        // Count the frequency of words in the sentence
        Map<String, Integer> wordCountMap = countWordFrequency(sentence);

        // Print each word and its frequency
        printWordFrequency(wordCountMap);

        scanner.close();
    }
}

