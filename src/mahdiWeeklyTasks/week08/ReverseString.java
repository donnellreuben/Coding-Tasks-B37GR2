package mahdiWeeklyTasks.week08;

public class ReverseString {

    /*
    Write a function that can reverse a String
        Ex: Reverse("ABCD"); ==> DCBA
     */

    public static String reverse(String input) {
        if (input == null || input.isEmpty()) {
            return input;  // Return the input as is if it's null or empty
        }

        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {
        String input = "ABCD";
        String output = reverse(input);
        System.out.println(output);  // Output will be "DCBA"
    }
}
