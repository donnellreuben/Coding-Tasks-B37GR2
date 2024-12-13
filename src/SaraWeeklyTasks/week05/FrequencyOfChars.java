package SaraWeeklyTasks.week05;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfChars {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter a String with some frequency characters : ");
        String str = scanner.next();
        frequency_of_characters(str);

    }

    public static void frequency_of_characters(String str){
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char each : str.toCharArray()) { // Convert the string to a char array
            frequencyMap.put(each, frequencyMap.getOrDefault(each,0)+1);
        }

        frequencyMap.forEach((k, v) -> System.out.print( k + "" + v ));
        System.out.println("second way: ");

        for (Map.Entry<Character, Integer> characterIntegerEntry : frequencyMap.entrySet()) {
            System.out.print(characterIntegerEntry.getKey());
            System.out.print( characterIntegerEntry.getValue());


        }

    }

    /*
   Write function that can find the frequency of characters

    Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

    Rasha is volunteer
*/

}
