package donnellWeeklyTasks.Week01;

public class OddOrEven {

        /*
    Write a method which can identifies given number is even or odd

        EX:
        identify(5) ->  "Odd"
        identify(6) ->  "Even"

     */

    public static void main(String[] args) {
        System.out.println(identify(5));
        System.out.println(identify(6));
    }

    public static String identify(int input) {

        String result = "";
        if (input % 2 == 0) {
            result = "Even";
        } else if (input % 1 == 0) {
            result = "Odd";
        }
        return result;
    }

}
