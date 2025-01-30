package RashaWeeklyTasks.week08;

public class ReverseString {
     /*
    Write a function that can reverse a String
        Ex: Reverse("ABCD"); ==> DCBA
     */

    public static void main(String[] args) {
        String str = "ABCD";
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
            System.out.println(reverse);

        }

    }
}
