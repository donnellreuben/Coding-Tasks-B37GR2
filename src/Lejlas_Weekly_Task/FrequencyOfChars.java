package Lejlas_Weekly_Task;

public class FrequencyOfChars {

    /*
   Write function that can find the frequency of characters

    Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

    Rasha is volunteer

     */

    public static void main(String[] args) {

        String input = "AAABBCDD";


        while (input.length() > 0) {
            char currentChar = input.charAt(0);
            int frequency = 0;

            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == currentChar) {
                    frequency++;
                }
            }
            input = input.replaceAll(String.valueOf(currentChar), "");


            System.out.print(currentChar + "" + frequency);


        }
    }
}






