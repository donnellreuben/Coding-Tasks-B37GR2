package halnurWeeklyTasks.week07;

public class FindUniqueChars {
    /*
    Write a return method that can find the unique characters from the String
            Ex: unique("AAABBBCCCDEF") ==> "DEF";

     */

    public static String findUniqueChars(String str) {
        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;

            // Count how many times str.charAt(i) appears in the string
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            // If the character appears  once and is not already in 'unique', add it
            if (count == 1 && !unique.contains(String.valueOf(str.charAt(i)))) {
                unique += str.charAt(i);
            }
        }

        return unique;
    }


    public static void main(String[] args) {
        System.out.println(findUniqueChars("AAABBBCCCDEF"));
    }

}
