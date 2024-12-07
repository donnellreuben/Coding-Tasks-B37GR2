package donnellWeeklyTasks.Week04;

public class ReverseNegativeNumber {
        /*

    Write a return method that can reverse negative number and return it as int

      Ex:
      input => -456     || -12
      output => -654    || -21

     */

    public static void main(String[] args) {
        System.out.println(reverseNegNum(-12));

    }


    public static int reverseNegNum(int input) {

        // make input positive ⚡
        int positiveInput = Math.abs(input);

        // convert to string ⚡
        String newStringInput = String.valueOf(positiveInput);

        // create StringBuilder to make mutable and reverse ⚡
        StringBuilder sb = new StringBuilder(newStringInput);
        String result = sb.reverse().toString();

        // covert(parse) back to int and make negative ⚡
        return -Integer.parseInt(result);
    }


}
