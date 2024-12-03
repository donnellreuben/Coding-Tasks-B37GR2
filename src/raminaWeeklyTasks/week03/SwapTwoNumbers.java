package raminaWeeklyTasks.week03;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        //Swap two variable values without using a third variable
        //
        //    int a = 5;
        //    int b = 7;
        //
        //   System.out.println("a = " + a); //=> a = 7
        //   System.out.println("b = " + b); //=> b = 5

        int a = 5;
        int b = 7;
        
        b = b + a; //b = 12
        a = b - a; //a = 7
        b = b - a; //b = 5

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
