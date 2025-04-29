package mahdiWeeklyTasks.week11;

import java.util.Arrays;

public class MoveZerosToEnd {
    /*
    write a program that can move all the zeros to the end of an int array

    input =  [ 1, 2, 0, 0, 5, 0, 6, 9]
    output = [ 1, 2, 5, 6, 9, 0, 0, 0]
    */

    public static void moveZerosToEnd(int[] arr) {
        if (arr == null || arr.length == 0) {
            return; // Handle edge cases
        }

        int index = 0; // Position to place non-zero elements

        // Traverse the array and move non-zero elements forward
        for (int num : arr) {
            if (num != 0) {
                arr[index++] = num;
            }
        }

        // Fill the rest of the array with zeros
        while (index < arr.length) {
            arr[index++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 0, 0, 5, 0, 6, 9};
        moveZerosToEnd(input);
        System.out.println(Arrays.toString(input)); // Output: [1, 2, 5, 6, 9, 0, 0, 0]
    }
}
