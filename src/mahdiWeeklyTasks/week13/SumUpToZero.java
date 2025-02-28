package mahdiWeeklyTasks.week13;

import java.util.Arrays;

public class SumUpToZero {


  /*
    Write a function:
        that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
        The function can return any such array.
        For example, given N = 4, the function could return [1,0,-3,2] or [-2,1,-4,5].
        The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice).
        For N = 3 one of the possible answers is [-10,3,7] (but there are many more correct answers).
     */

    public static int[] sumZero(int N) {
        int[] result = new int[N];
        int sum = 0;

        // Fill array with first N-1 unique numbers
        for (int i = 0; i < N - 1; i++) {
            result[i] = i + 1;
            sum += result[i];
        }

        // Set the last element to balance the sum to zero
        result[N - 1] = -sum;

        return result;
    }

    public static void main(String[] args) {
        int N = 4; // Example
        System.out.println(Arrays.toString(sumZero(N)));
    }
}
