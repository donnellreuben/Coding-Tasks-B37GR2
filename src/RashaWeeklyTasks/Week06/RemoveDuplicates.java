package RashaWeeklyTasks.Week06;

public class RemoveDuplicates {
    /*
    Write function that can remove the duplicated values from String
            Ex: removeDup("AAABBBCCC") ==> ABC
     */
    public static void main(String[] args) {
        String str = "AAABBBCCC";
        System.out.println(removeDuplicate(str)); // Output: ABC

    }
    public static String removeDuplicate(String str) {

        String RD = "";
        for (int i = 0; i < str.length(); i++) {
            if (!RD.contains(String.valueOf(str.charAt(i)))) {
                RD += str.charAt(i);
            }
        }
        return RD;
    }
}
