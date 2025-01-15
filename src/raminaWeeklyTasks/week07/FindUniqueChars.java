package raminaWeeklyTasks.week07;

public class FindUniqueChars {
     /*
    Write a return method that can find the unique characters from the String
            Ex: unique("AAABBBCCCDEF") ==> "DEF";
     */

    public static void main(String[] args) {
        System.out.println(findUniqueCharacters("AAABBBCCCDEF")); //--> "DEF"
        System.out.println(findUniqueCharacters("APPLE")); //--> "ALE"
    }

    public static String findUniqueCharacters(String str) {
        StringBuilder result = new StringBuilder(); // --> used to construct the result string with non-duplicate characters

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (str.indexOf(currentChar) == str.lastIndexOf(currentChar)) {
                result.append(currentChar);
            }
        }

        return result.toString();
    }
}
