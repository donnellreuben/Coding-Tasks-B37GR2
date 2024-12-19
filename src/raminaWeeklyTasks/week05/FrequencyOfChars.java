package raminaWeeklyTasks.week05;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfChars {
    /*
   Write function that can find the frequency of characters

    Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

*/
    public static void main(String[] args) {
        System.out.println(frequencyOfChars("AAABBCDD"));
    }
    public static String frequencyOfChars(String str){
        String result = "";
        Map<Character, Integer> output = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char key = str.charAt(i);
            if (!output.containsKey(key)){
                output.put(key, 0);
            }
            output.put(key, output.get(key) + 1);
        }
        for (Map.Entry<Character, Integer> each : output.entrySet()) {
            result += (each.getKey() + "" + each.getValue());
        }
        return result.toString();
    }

}
