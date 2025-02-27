package SaraWeeklyTasks.week10;

import java.util.Scanner;

public class FindMinimumArray_W10 {
    /*
    Write a function that can find the minimum number from an int Array
     */

    public static int findMinNum (int[] num){

        int min = num[0];
        for (int each : num) {
            min = (each <= min)? each: min;
        }
        return min;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = scanner.nextInt();
        int num[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter " + i + " number: ");
            num[i] = scanner.nextInt();
        }

        System.out.println("The minimum numbet in thid array is: " + findMinNum(num) );
    }
}
