package Lejlas_Weekly_Task.week10;

public class FindMinimumArray_W10 {

     /*
    Write a function that can find the minimum number from an int Array
     */


    //Mykola is volunteer


    public static void main(String[] args) {
        int[] numbers = {9, 5, 8, 7, 4};
        System.out.println(findMin(numbers)); // Output: 1
    }

    public static int findMin(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }

        int min = arr[0]; // Assume first element is the smallest
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}


