package raminaWeeklyTasks.week08;

public class ReverseString {
    /*
    Write a function that can reverse a String
        Ex: Reverse("ABCD"); ==> DCBA
     */
    public static void main(String[] args) {
        System.out.println(reverseString("ABCD"));
    }

    public static String reverseString(String string){
        String reversed = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reversed += string.charAt(i);
        }
        return reversed;
    }
}
