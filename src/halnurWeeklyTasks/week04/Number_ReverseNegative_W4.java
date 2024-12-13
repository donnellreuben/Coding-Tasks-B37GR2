package halnurWeeklyTasks.week04;
/*
   Write a return method that can reverse
negative number and return it as int
     Ex:
     input => -456
     output => -654
    */
public class Number_ReverseNegative_W4 {

    public static int reverse(int input) {
        String str = String.valueOf(input);    //  --->"-456"
        int inputReversed = 0;

        String strReverse = "-";

        if (input < 0) {
            for (int i = str.length() - 1; i > 0; i--) {
                strReverse += str.charAt(i);         //----->  "-654"
            }
        }else if (input>0) {
            for (int i = str.length() - 1; i >= 0; i--) {
                strReverse += str.charAt(i);
            }
        }else{
            return 0;
        }
        inputReversed = Integer.parseInt(strReverse);
        return inputReversed;
    }




    public static void main(String[] args) {
        int input=-456;
        System.out.println(reverse(input));
    }

}

