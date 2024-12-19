package halnurWeeklyTasks.week05;

import java.util.HashMap;
import java.util.Map;

/*Write function that can find the frequency of characters

Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2*/
public class FrequencyOfChars {

    public static String frequencyOfChars(String str) {
        // Create a map to store character frequencies
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Iterate through the string to count frequencies
        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Build the resulting frequency string
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            result.append(entry.getKey()).append(entry.getValue());
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String input = "AAABBCDD";
        String output = frequencyOfChars(input);
        System.out.println("Frequency of characters: " + output);
    }




    }
