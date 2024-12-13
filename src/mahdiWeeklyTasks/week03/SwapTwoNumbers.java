package mahdiWeeklyTasks.week03;

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
        int a = 5;
        int b = 7;

        System.out.println("Before Swapping");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swapping without a Third variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swapping");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
