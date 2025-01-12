package SaraWeeklyTasks.Week07;

import java.util.Scanner;

public class FindUniqueChars {
    /*
    Write a return method that can find the unique characters from the String
            Ex: unique("AAABBBCCCDEF") ==> "DEF";

     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a string containing duplicate characters: ");
        String str = scanner.nextLine();
        System.out.println("uniqueChar = " + uniqueChar(str));
    }

    public static String uniqueChar(String st){
        String uniqeSt = "";

        for (int i = 0; i < st.length(); i++) {
            boolean uniqeFlag = true;

            for (int j = 0; j < st.length(); j++) {
                if ( (i != j) && (st.charAt(i) == st.charAt(j))){
                    uniqeFlag = false;
                    break;
                } /*else if ( j == st.length()-1) {
                    uniqeSt += st.charAt(i);
                }*/
            }
            if ( uniqeFlag){
                uniqeSt += st.charAt(i);
            }

        }
        return uniqeSt;

    }
}
