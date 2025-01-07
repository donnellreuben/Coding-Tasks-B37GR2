package Lejlas_Weekly_Task.week6;

public class RemoveDuplicates {

      /*
    Write function that can remove the duplicated values from String
            Ex: removeDup("AAABBBCCC") ==> ABC
     */

    //Lejla is volunteer

    public static void main(String[] args) {

        //Using String Contains

            String str = "AAABBBCCC"; // initialize a string variable
            System.out.println(removeDup(str)); // method is being called with and arguments to remove duplicates
        }

    public static String removeDup(String str) {
        String result = ""; // it is empty string - this will hold an unique character from str
        for (char ch : str.toCharArray()) { //loop will iterats through each character in
            // the input is sting(str) and using toCharArray - which converts the string into a character array
            if (!result.contains(String.valueOf(ch))) { //this will check duplicates
                result += ch;
            }
        }
        return result; //it will contain all unique characters from the ihe input(str) - the
    }

    }

