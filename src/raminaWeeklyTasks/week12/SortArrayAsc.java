package raminaWeeklyTasks.week12;

import java.util.Arrays;

public class SortArrayAsc {

     /*
    Write a method that can sort an int array in Ascending order without using the sort method


    input = [1, 2, 0, 5, 4, 7, 9]
    output = [ 0, 1, 2, 4, 5, 7, 9]
     */

    public static void main(String[] args) {
        int[] array = {1, 2, 0, 5, 4, 7, 9};
        System.out.println(Arrays.toString(sortArrayAsc(array)));//[ 0, 1, 2, 4, 5, 7, 9]

    }

    public static int[] sortArrayAsc(int[] arr){
                int n = arr.length;
                for (int i = 0; i < n - 1; i++) {
                    int minIndex = i; // Assume the first element is the smallest

                    // Find the smallest element in the remaining array
                    for (int j = i + 1; j < n; j++) {
                        if (arr[j] < arr[minIndex]) {
                            minIndex = j; // Update minIndex if a smaller element is found
                        }
                    }

                    // Swap the found minimum element with the first element
                    int temp = arr[minIndex];
                    arr[minIndex] = arr[i];
                    arr[i] = temp;

                }
                return arr;

    }

}
