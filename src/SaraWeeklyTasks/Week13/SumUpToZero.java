package SaraWeeklyTasks.Week13;

import java.util.Arrays;
import java.util.Scanner;

public class SumUpToZero {



  /*
    Write a function:
        that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
        The function can return any such array.
        For example, given N = 4, the function could return [1,0,-3,2] or [-2,1,-4,5].
        The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice).
        For N = 3 one of the possible answers is [-10,3,7] (but there are many more correct answers).
     */

        // Sara is volunteer

        public static int[] sumUpToZero(int n){

            //Initial an empty arr
            int[] sumUpToZero = new int[n];

            //to store sum of numbers
            int sum = 0;

            for (int i = 0; i < n-1; i++) {

                int ranNum = (int)(Math.random() * 10); //Math.random() generates a random double between 0.0 and 1.0
                while ( contains(sumUpToZero, ranNum)){
                    ranNum = (int)(Math.random() * 10);
                }
                sumUpToZero[i] =  ranNum;
                sum += sumUpToZero[i];

            }

            sumUpToZero[n-1] = -sum;

            return sumUpToZero;

        }

        public static boolean contains ( int arr[], int n){
            for (int i = 0; i < arr.length; i++) {
                if( arr[i] == n) return true;
            }
            return false;
        }



        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number between 1 to 100: ");
            int n = scanner.nextInt();

            if( n <= 1 || n >= 100){
                System.err.println("Invalid number!!");
                System.exit(0);
            }

            int[] sumUpToZero = sumUpToZero(n);

            System.out.println("An Array of " + n + " unique integer with SUM Up To Zero = " + Arrays.toString(sumUpToZero));
        }



}
