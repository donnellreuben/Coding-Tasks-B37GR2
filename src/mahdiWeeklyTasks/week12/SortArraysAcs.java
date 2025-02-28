package mahdiWeeklyTasks.week12;

public class SortArraysAcs {

    public static void sortAscending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 0, 5, 4, 7, 9};

        sortAscending(input);

        // Print sorted array
        for (int num : input) {
            System.out.print(num + " ");
        }
    }
}
