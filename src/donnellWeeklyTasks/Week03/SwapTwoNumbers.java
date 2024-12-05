package donnellWeeklyTasks.Week03;

public class SwapTwoNumbers {
    /*
        Swap two variable values without using a third variable

    int a = 5;
    int b = 7;

   System.out.println("a = " + a); //=> a = 7
   System.out.println("b = " + b); //=> b = 5

     */

    public static void main(String[] args) {

        swapTwoNums(7, 5);
    }


    public static void swapTwoNums( int a, int b) {

        a = a * b;
        b = a / b;
        a = a / b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
