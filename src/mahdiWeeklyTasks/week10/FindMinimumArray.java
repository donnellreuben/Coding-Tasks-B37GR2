package mahdiWeeklyTasks.week10;

public class FindMinimumArray {

    /*
    Write a function that can find the minimum number from an int Array
     */

    public static int findMin(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int min = numbers[0]; // Assume first element is the minimum
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 3, 9, 1, 6, -2, 8};
        System.out.println("Minimum number: " + findMin(numbers)); // Output: -2
    }
}
