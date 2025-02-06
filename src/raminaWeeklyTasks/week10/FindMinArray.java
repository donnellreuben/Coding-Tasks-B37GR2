package raminaWeeklyTasks.week10;

import java.util.Arrays;

public class FindMinArray {

       /*
    Write a function that can find the minimum number from an int Array
     */

    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5, 6};
        int[] y = {33, 11, 65, 23, 87};
        System.out.println(findMinArray(x)); //1
        System.out.println(findMinArray(y)); //11
    }

    public static int findMinArray(int[] numbers){
        if(numbers == null || numbers.length == 0){
            System.out.println("Array is empty");
            return 0;
        }

        int min = numbers[0];
        for (int eachNumber : numbers) {
            if (eachNumber < min){
                min = eachNumber;
            }
        }
        return min;
    }
}
