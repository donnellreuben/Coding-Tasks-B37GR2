package mahdiWeeklyTasks.week05;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {

    public static String frequencyOfChars (String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }
        // Create a map to store character frequencies
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Count frequencies
        for (char c : input.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        //Build the output string
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            result.append(entry.getKey()).append(entry.getValue());
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "AAABBCDD";
        String result = frequencyOfChars(input);
        System.out.println(result);
    }
}
