package raminaWeeklyTasks.week06;

import java.time.Duration;

public class RemoveDuplicate {
  /*
    Write function that can remove the duplicated values from String
            Ex: removeDup("AAABBBCCC") ==> ABC
     */
  public static void main(String[] args) {
      String string = "AAABBBCCCDWR";
      System.out.println(removeDuplicate(string));
  }

    public static String removeDuplicate(String string){
        String result = "";
        for (int i = 0; i < string.length(); i++){
            if (!result.contains(String.valueOf(string.charAt(i)))){
                result += string.charAt(i);
            }
        }
        return result;
    }
}
