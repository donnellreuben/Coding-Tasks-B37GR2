package raminaWeeklyTasks.week11;

import java.util.Arrays;

public class MoveZerosToEnd {

     /*
    write a program that can move all the zeros to the end of an int array

    input =  [ 1, 2, 0, 0, 5, 0, 6, 9]
    output = [ 1, 2, 5, 6, 9, 0, 0, 0]

     */
     public static void main(String[] args) {
         int[] list = {1, 2, 0, 0, 5, 0, 6, 9};
         moveZeros(list);
     }
    public static void moveZeros(int[] listOfNumbers){
        int[] moves = new int[listOfNumbers.length];
        for (int i = 0, y = 0; i < listOfNumbers.length; i++) { //i is the read from array, y is to store the moved
            if (listOfNumbers[i] != 0){
                moves[y++] = listOfNumbers[i];
            }
        }
        System.out.println(Arrays.toString(moves));
    }
}
