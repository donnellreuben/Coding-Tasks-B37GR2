package halnurWeeklyTasks.week11;

import java.util.Arrays;

public class MoveZerosToEnd {
     /*
    write a program that can move all the zeros to the end of an int array

    input =  [ 1, 2, 0, 0, 5, 0, 6, 9]
    output = [ 1, 2, 5, 6, 9, 0, 0, 0]

     */
    public static void moveZerosToEnd(int[] arr) {
        int[] newArr = new int[arr.length];


        for(int i=0, j=0; i<arr.length; i++){
            if(arr[i] != 0){
                newArr[j] = arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(newArr));
    }


    public static void main(String[] args) {

       int[] arr = {1, 2, 0, 0, 5, 0, 6, 9};
        moveZerosToEnd(arr);

    }


}
