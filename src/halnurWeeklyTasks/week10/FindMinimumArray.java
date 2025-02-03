package halnurWeeklyTasks.week10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindMinimumArray {

    public static void main(String[] args) {
        int[]  arr = {5,8,9,3,4,58,65,41};
        System.out.println(findMinimumArray1(arr));
        System.out.println(findMinimumArray2(arr));
        System.out.println(findMinimumArray3(arr));

    }

    public static int findMinimumArray1(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>(arr.length);
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        int minArr=Collections.min(list);
        return minArr;
    }



    public static int findMinimumArray2(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>(arr.length);
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        Collections.sort(list);
        int  minArr=list.get(0);
        return minArr;
    }

    public static int findMinimumArray3(int[] arr) {
        int minArr=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<minArr){
                minArr=arr[i];
            }
        }
        return minArr;
    }




}
