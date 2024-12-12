package troyWeeklyTasks.Week04;

public class Number_ReverseNegative_W4 {

    /*
    Write a return method that can reverse
negative number and return it as int

      Ex:
      input => -456
      output => -654



      Halnur is volunteer
     */

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
