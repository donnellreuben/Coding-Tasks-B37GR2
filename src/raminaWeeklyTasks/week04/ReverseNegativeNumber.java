package raminaWeeklyTasks.week04;

public class ReverseNegativeNumber {
    /*
    Write a return method that can reverse
negative number and return it as int

      Ex:
      input => -456
      output => -654
     */
    public static void main(String[] args) {
        System.out.println(reverse_negative_num(-456));
        System.out.println(reverse_negative_num(-789));

    }
    public static int reverse_negative_num(int num){
        String string = String.valueOf(num);
        int inputReversed = 0;

        String reversed = "-"+"";

        if (num < 0) {

            for (int i = string.length() - 1; i > 0; i--) {
                reversed += string.charAt(i);
            }
        }
        inputReversed = Integer.parseInt(reversed);
        return inputReversed;
    }
}
