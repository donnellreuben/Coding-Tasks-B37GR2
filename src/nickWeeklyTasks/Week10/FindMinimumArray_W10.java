package nickWeeklyTasks.Week10;

public class FindMinimumArray_W10 {

    /*
    Write a function that can find the minimum number from an int Array
     */

    public static void main(String[] args) {
        int[] numbers = {10, 3, 7, 2, 8, -1, 5};
        System.out.println(findNum(numbers));
    }

    public static int findNum (int[] arr) {

        int min = arr[0]; // Assume the first element is the minimum

        // Iterate over the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i]; // Update min if a smaller number is found
            }
        }
        return min;
    }


}
