package troyWeeklyTasks.Week08;

public class ReverseString {


     /*
    Write a function that can reverse a String
        Ex: Reverse("ABCD"); ==> DCBA
     */

    //Lejla is volunteer


    public static String StrReverse(String str) {

        String reverse="";

        for(int i = str.length()-1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;

    }



}
