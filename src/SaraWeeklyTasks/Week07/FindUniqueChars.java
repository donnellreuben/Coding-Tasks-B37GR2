package SaraWeeklyTasks.Week07;

public class FindUniqueChars {
    /*
    Write a return method that can find the unique characters from the String
            Ex: unique("AAABBBCCCDEF") ==> "DEF";

     */

    public static void main(String[] args) {
        System.out.println("uniqueChar(\"AAAJBBBCCCDEF\") = " + uniqueChar("AZAAJBBBCCCDEF"));
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
