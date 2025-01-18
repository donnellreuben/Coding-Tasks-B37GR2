package SaraWeeklyTasks.week08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ReverseString {

     /*
    Write a function that can reverse a String
        Ex: Reverse("ABCD"); ==> DCBA
     */

    //Lejla is volunteer

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String st = scanner.next();
        //String st = "ABCD";
        System.out.println("reverse string is = " + reverse1(st));
        scanner.close();
    }

    public static String reverse1( String st){
        String revSt = "";

//        for (int i = (st.length())-1 ; i >= 0 ; i--) {
//
//            revSt = revSt + st.charAt(i) +"";
//        }


        StringBuilder reverseStr = new StringBuilder(st).reverse();
        revSt = reverseStr.toString();
        return revSt;



    }

}
