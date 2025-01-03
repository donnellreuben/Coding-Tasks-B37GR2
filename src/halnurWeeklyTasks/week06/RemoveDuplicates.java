package halnurWeeklyTasks.week06;

import java.util.*;

import static java.util.Arrays.*;

public class RemoveDuplicates {
//    Write function that can remove the duplicated values from String
//    Ex: removeDup("AAABBBCCC") ==> ABC

    public static String RemoveDuplicates(String str) {
        StringBuilder result = new StringBuilder();

       for (char c : str.toCharArray()) {
           if(result.indexOf(String.valueOf(c))==-1){
               result.append(c);
           }
       }
     return result.toString();
    }


    public static void main(String[] args) {
        String str="ABACBDCEA";
        System.out.println(RemoveDuplicates(str));
    }
}
