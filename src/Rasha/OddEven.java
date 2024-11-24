package Rasha;

public class OddEven {
   /* Write a method which can identifies given number is even or odd

    EX:
    identify(5) ->  "Odd"
    identify(6) ->  "Even" */

    public static void main(String[] args) {
        System.out.println(identify(5)); // Output: Odd
        System.out.println(identify(6)); // Output: Even

    }

    public static String identify(int num) {
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}
