package Rasha.week04;

public class reverse_negative_number {

   /* public static void main(String[] args) {
        int input=-456;
        System.out.println("output ="+reverse(input));

    }


    public static int reverse(int input) {
        String str = String.valueOf(input);
        int inputReversed = 0;

        String strReverse = "-"+"";
        if (input < 0) {

            for (int i = str.length() - 1; i > 0; i--) {
                strReverse += str.charAt(i);
            }
        }
        inputReversed = Integer.parseInt(strReverse);
        return inputReversed;
    };*/


    public static int reverseNum(int number){
        if(number < 10 && number >= 0){
            return number;
        }

        int result = 0;
        while ( number !=0 ) {
            result = result * 10 + number % 10; // 65
            //           0      +       6
            //           6      +       5
            //          65     +        4
            number /= 10; //4
        }

        return result;//654
    }

    public static void main(String[] args) {

        System.out.println(reverseNum(-456));


        int a = 5454545;
        int result1 = a % 10;
        System.out.println(result1);
    }



}
