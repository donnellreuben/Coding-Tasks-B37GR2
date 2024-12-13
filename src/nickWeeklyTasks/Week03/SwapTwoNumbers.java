package nickWeeklyTasks.Week03;

public class SwapTwoNumbers {

    /*


    Swap two variable values without using a third variable

    int a = 5;
    int b = 7;

   System.out.println("a = " + a); //=> a = 7
   System.out.println("b = " + b); //=> b = 5

     */

    public static void main(String[] args) {
        int a = 5;
        int b = 7;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swap values without using a third variable
        a = a + b; // a becomes 12 (5 + 7)
        b = a - b; // b becomes 5 (12 - 7)
        a = a - b; // a becomes 7 (12 - 5)

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
