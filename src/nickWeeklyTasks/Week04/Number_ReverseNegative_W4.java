package nickWeeklyTasks.Week04;

public class Number_ReverseNegative_W4 {

    /*
    Write a return method that can reverse
negative number and return it as int

      Ex:
      input => -456
      output => -654
     */

    public static void main(String[] args) {
        int input = -456;
        int output = reverseNegative(input);
        System.out.println("Reversed: " + output); // Output: -654
    }

    public static int reverseNegative(int number) {
        int reversed = 0;
        int num = -number; // Convert the negative number to positive

        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }

        return -reversed; // Convert it back to negative
    }
}
