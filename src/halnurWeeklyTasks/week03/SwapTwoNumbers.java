package halnurWeeklyTasks.week03;
 /*
Swap two variable values without using a third variable
 int a = 5;
 int b = 7;
 System.out.println("a = " + a); //=> a = 7
 System.out.println("b = " + b); //=> b = 5
*/
public class SwapTwoNumbers {

    public static void swapTwoNumbers(int a, int b){

       if(a!=b){
           System.out.println("a = " +b);
           System.out.println("b = " + a);
       }else{
           System.out.println("a = " + a);
           System.out.println("b = " + b);
       }
    }

    public static void main(String[] args) {

        swapTwoNumbers(5,7);

    }






}
