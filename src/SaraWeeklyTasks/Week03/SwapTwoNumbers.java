package SaraWeeklyTasks.Week03;

import java.util.Scanner;

public class SwapTwoNumbers {

         /*

    Swap two variable values without using a third variable
    int a = 5;
    int b = 7;
   System.out.println("a = " + a); //=> a = 7
   System.out.println("b = " + b); //=> b = 5
      Ramina is volunteer for this

     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nPlease Enter a number for A's value: ");
        int a = scanner.nextByte();
        System.out.print("\nPlease Enter a number for B's value: ");
        int b = scanner.nextByte();

        swapTwoNumbers(a,b);


    }

    public static void swapTwoNumbers(int a, int b){

        b = a + b;
        a = b - a;
        b = b - a;

        System.out.println("\n <---- After swap ---> \n\t\tA is " + a + "\n\t\tB is " + b);




         
    }


}
