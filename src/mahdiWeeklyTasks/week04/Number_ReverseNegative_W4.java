package mahdiWeeklyTasks.week04;

public class Number_ReverseNegative_W4 {

       /*
    Write a return method that can reverse
negative number and return it as int
      Ex:
      input => -456
      output => -654

      Halnur is volunteer
     */

    public static void main(String[] args) {

        int input = -456;
        int reversed = reverseNegativeNumber(input);

        System.out.println("Reverse Number :" + reversed);
    }
    public static int reverseNegativeNumber (int number) {
        //Number should be negative
        if (number > 0) {
            number = -number;
        }
        // Reverse the number using a loop
        int reversed = 0;
        while (number !=0) {
            int digit = number % 10; // Extract the last digit
            reversed = reversed * 10 + digit; //Append the digit to the reversed number
            number /= 10; // remove the last digit from the number
        }
        return   reversed;
    }
}
