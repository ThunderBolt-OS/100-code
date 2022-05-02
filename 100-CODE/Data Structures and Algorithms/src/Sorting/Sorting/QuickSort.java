package Sorting;

import java.util.*;

public class QuickSort {
    public static void main(String[] args) {

        int[] arr = {5, 4, 3, 2, 1};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    
    /*
     * @param nums: An integer array
     * @return: void
     * 
     * @Description: Quick Sort 
     * @Time Complexity: O(n*log(n))
     * @Space Complexity: O(1)
     * Worst case: O(n*log(n)) (if the array is already sorted in descending order)
     * Best case: O(n*log(n)) (if the array is already sorted in ascending order)
     * Average case: O(n*log(n)) (random nums)
     * 
    */

    static void sort(int[] nums, int low, int hi) {
        if (low >= hi) {
            return;
        }

        int s = low;
        int e = hi;
        int m = s + (e - s) / 2;
        int pivot = nums[m];

        while (s <= e) {

            // also a reason why if its already sorted it will not swap
            while (nums[s] < pivot) {
                s++;
            }
            while (nums[e] > pivot) {
                e--;
            }

            if (s <= e) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }

        // now my pivot is at correct index, please sort two halves now
        sort(nums, low, e);
        sort(nums, s, hi);
    }
}