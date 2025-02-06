package Lejlas_Weekly_Task.week8;

public class ReverseString {


     /*
    Write a function that can reverse a String
        Ex: Reverse("ABCD"); ==> DCBA
     */

    //Lejla is volunteer

    public static void main(String[] args) {

        // Option#1
        String reverseStr = new StringBuilder("ABCD").reverse().toString();
        System.out.println(reverseStr);



        //Option#2
        String reverse1 = "ABCD";
   for (int i = (reverse1.length())-1 ; i >= 0 ; i--) {
        System.out.print(reverse1.charAt(i));
    }


    }

}


