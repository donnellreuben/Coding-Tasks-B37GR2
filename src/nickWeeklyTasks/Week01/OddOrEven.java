package nickWeeklyTasks.Week01;

public class OddOrEven {
    public static void main(String[] args) {

//    Write a method which can identifies given number is even or odd
//
//        EX:
//        identify(5) ->  "Odd"
//        identify(6) ->  "Even"

        System.out.println(identify(5)); // Output: Odd
        System.out.println(identify(6)); // Output: Even
    }

        // There are ways to solve this task:
        //#1 using an if-else statement
        public static String identify(int number) {
            if (number % 2 == 0) {
                return "Even";
            } else {
                return "Odd";
            }

    }

        //#2 using a ternary operator
//        public static String identify(int number) {
//            return (number % 2 == 0) ? "Even" : "Odd";
//        }

}
