package Lejlas_Weekly_Task.week4;

public class ReverseNegativeNumber {

        /*
    Write a return method that can reverse
negative number and return it as int

      Ex:
      input => -456
      output => -654



      Halnur is volunteered
     */

        public static void main(String[] args) {


            int input = -456;

            String inputString = Integer.toString(input);

            StringBuilder reverse = new StringBuilder(inputString.substring(1));
            System.out.print("-");
            for (int i = reverse.length() - 1; i >= 0; i--) {
                System.out.print(reverse.charAt(i));
            }
        }
    }

