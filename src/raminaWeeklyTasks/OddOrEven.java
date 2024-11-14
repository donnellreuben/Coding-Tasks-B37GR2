package raminaWeeklyTasks;

public class OddOrEven {
    /*
    Write a method which can identifies given number is even or odd

        EX:
        identify(5) ->  "Odd"
        identify(6) ->  "Even"

     */
    public static void main(String[] args) {
        int num = 6;
        if (num % 2 == 0){
            System.out.println("identify(" + num + ") -> Even");
        }
        else {
            System.out.println("identify(" + num + ") -> Odd");
        }
    }


}
