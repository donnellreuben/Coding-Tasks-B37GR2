package Rasha.week03;

public class SwapTwoNumbers {
    /*     Swap two variable values without using a third variable

    int a = 5;
    int b = 7;

   System.out.println("a = " + a); //=> a = 7
   System.out.println("b = " + b); //=> b = 5  */

    public static void main(String[] args) {
        int a = 5;
        int b = 7;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(" a = " + a + ", b = " + b);

    }
}
