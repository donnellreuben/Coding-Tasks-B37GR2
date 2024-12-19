package SaraWeeklyTasks.week04;

import java.util.Scanner;

public class Number_ReverseNegative_W4 {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter a negative number : ");
        int num = scanner.nextInt();
        if(num >= 0){
            System.out.println("The number is not negative! ");
            System.out.print("Enter a negative number : ");
            num = scanner.nextInt();
        }


        System.out.println("reverseNegative_number(num) = " + reverseNegative_number(num));


    }




    public static int reverseNegative_number(int number){

        int reverseNumber = 0 ;

        while (number != 0){
            reverseNumber = reverseNumber * 10 + (number % 10);
            number /= 10;
        }

        return reverseNumber;
    }



    /*
    Write a return method that can reverse
negative number and return it as int

      Ex:
      input => -456
      output => -654



      Halnur is volunteer
     */
}
