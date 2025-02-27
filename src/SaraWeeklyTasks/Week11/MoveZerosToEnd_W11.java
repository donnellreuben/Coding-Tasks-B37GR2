package SaraWeeklyTasks.Week11;

import java.util.Arrays;

public class MoveZerosToEnd_W11 {

    /*
    write a program that can move all the zeros to the end of an int array

    input =  [ 1, 2, 0, 0, 5, 0, 6, 9]
    output = [ 1, 2, 5, 6, 9, 0, 0, 0]

     */

    public static void moveZeroToEnd(int[] arr){

        for (int i = (arr.length)-1 ; i >= 0; i--) {
            if( arr[i] == 0 ){
                if ( i != (arr.length)-1) {
                    for (int j = i; j < (arr.length) - 1; j++) {
                        int storage = arr[j + 1];
                        arr[j + 1] = arr[j];
                        arr[j] = storage;
                    }
                }
            }
        }
                System.out.println(Arrays.toString(arr));
    }


    public static void moveZeroToEnd2(int[] arr){
        int nonZeroIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if( arr[i] != 0){
                int temp = arr[nonZeroIndex];
                arr [nonZeroIndex] = arr[i];
                arr[i] = temp;
                nonZeroIndex ++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int [] arr = { 1, 2, 0, 0, 0, 5, 0, 6, 9, 0};

        System.out.println(Arrays.toString(arr));

        moveZeroToEnd2(arr);
    }
}
