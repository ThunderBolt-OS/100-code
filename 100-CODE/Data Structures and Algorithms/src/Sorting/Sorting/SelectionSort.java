package Sorting;

import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = { 23, 7, 18, 10 };
        selection(nums);
        System.out.println(Arrays.toString(nums));
    }

    /*
     * @param nums: An integer array
     * @return: void
     
     * @Description: Selection Sort 
     * @Time Complexity: O(n^2)
     * @Space Complexity: O(1)
     * Worst case: O(n^2) (if the array is already sorted in descending order)
     * Best case: O(n) (if the array is already sorted in ascending order)
     * Average case: O(n^2) (random nums)
     
    */

    public static void selection(int[] arr) {
        // traversing through the array
        for (int i = 0; i < arr.length - 1; i++) {

            // now we are going to find the smallest element in the array
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            // after find the smallest element we are going to swap it with the current element
            swap(arr, i, min);
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}