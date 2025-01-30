package mahdiWeeklyTasks.week06;

public class RemoveDuplicates {

     /*
    Write function that can remove the duplicated values from String
            Ex: removeDup("AAABBBCCC") ==> ABC
     */

    public static String removeDuplicates(String input) {
        if (input == null || input.isEmpty()) {
            return input;  // Return input as is if null or empty
        }

        StringBuilder result = new StringBuilder();
        char lastChar = input.charAt(0);
        result.append(lastChar);

        for (int i = 1; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar != lastChar) {
                result.append(currentChar);
            }
            lastChar = currentChar;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "AAABBBCCC";
        String output = removeDuplicates(input);
        System.out.println(output);  // Output will be "ABC"
    }
}


