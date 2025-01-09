package SaraWeeklyTasks.week06;

public class RemoveDuplicates {
     /*
    Write function that can remove the duplicated values from String
            Ex: removeDup("AAABBBCCC") ==> ABC
     */
     public static void main(String[] args) {
         String st = "AAbABBBbbCCCd";
         System.out.println("removeDuplicate(st) = " + removeDuplicate(st));
     }
    public static String removeDuplicate (String st) {
        String s = "";
        for (int i = 0; i < st.length(); i++) {
            if (!(s.contains(String.valueOf(st.charAt(i))))) {
                s += (st.charAt(i));
            }
        }
        return s;
    }
}
