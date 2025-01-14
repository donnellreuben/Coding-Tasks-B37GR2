package Lejlas_Weekly_Task.week7;

public class FindUniqueChars {


    /*
    Write a return method that can find the unique characters from the String
            Ex: unique("AAABBBCCCDEF") ==> "DEF";

     */

    //Ramina is volunteer

    public static void main(String[] args) {

        String unique = "AAABBBCCCDEF";
        System.out.println(findUniqueChar(unique));
    }



        public static String findUniqueChar(String str) {

            StringBuilder uc = new StringBuilder();

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if(str.indexOf(c) == str.lastIndexOf(c)){
                    uc.append(c);

            }

        }
            return uc.toString();
    }
}
