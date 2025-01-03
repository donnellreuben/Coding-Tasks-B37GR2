package nickWeeklyTasks.Week05;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfChars {


//   Write function that can find the frequency of characters
//
//    Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

    public static String getFrequencyOfChars(String input) {
        // Use LinkedHashMap to maintain order of characters
        Map<Character, Integer> frequencyMap = new LinkedHashMap<>();

        // Iterate through the string and update the frequency map
        for (char c : input.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Build the result string
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (frequencyMap.containsKey(c)) {
                result.append(c).append(frequencyMap.get(c));
                frequencyMap.remove(c); // Ensure each character is added only once
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "AAABBCDD";
        String result = getFrequencyOfChars(input);
        System.out.println(result); // Output: A3B2C1D2
    }

}



