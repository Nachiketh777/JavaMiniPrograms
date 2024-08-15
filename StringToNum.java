import java.util.*;

public class StringToNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String output = convertToNumeric(input);
        System.out.println(output); // Output: 643
    }

    public static String convertToNumeric(String input) {
        // Create a map to store word-number mappings
        Map<String, String> wordToNumber = new HashMap<>();
        wordToNumber.put("zero", "0");
        wordToNumber.put("one", "1");
        wordToNumber.put("two", "2");
        wordToNumber.put("three", "3");
        wordToNumber.put("four", "4");
        wordToNumber.put("five", "5");
        wordToNumber.put("six", "6");
        wordToNumber.put("seven", "7");
        wordToNumber.put("eight", "8");
        wordToNumber.put("nine", "9");

        // Split the input string into words
        String[] words = input.split(" ");

        // Construct the numerical representation
        StringBuilder numericRepresentation = new StringBuilder();
        for (String word : words) {
            // Check if the word exists in the map
            if (wordToNumber.containsKey(word)) {
                numericRepresentation.append(wordToNumber.get(word));
            } else {
                // If the word is not found, append it as it is
                numericRepresentation.append(word);
            }
        }

        return numericRepresentation.toString();
    }
}