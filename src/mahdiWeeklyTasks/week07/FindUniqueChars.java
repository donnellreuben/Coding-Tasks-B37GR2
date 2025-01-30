package mahdiWeeklyTasks.week07;

import java.util.HashMap;

public class FindUniqueChars {

     /*
    Write a return method that can find the unique characters from the String
            Ex: unique("AAABBBCCCDEF") ==> "DEF";

     */

    public static String unique(String input) {
        // Check for null or empty string
        if (input == null || input.isEmpty()) {
            return "";
        }

        // Create a frequency map to count occurrences of each character
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        // Count occurrences of each character in the string
        for (char c : input.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Build a result string with characters that appear only once
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (frequencyMap.get(c) == 1) {
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "AAABBBCCCDEF";
        String output = unique(input);
        System.out.println(output);  // Output will be "DEF"
    }
}
