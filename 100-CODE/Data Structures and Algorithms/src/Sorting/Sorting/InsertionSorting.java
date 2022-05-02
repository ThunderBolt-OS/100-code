package Sorting;

import java.util.Arrays;

public class InsertionSorting {
    
    public static void main(String[] args) {
        int[] nums = { 5, 7, 8, 10 };
        insertion(nums);
        System.out.println(Arrays.toString(nums));
    }

    /*
        * @param nums: An integer array
        * @return: void
        
        * @Description: Insertion Sort 
        * @Time Complexity: O(n^2)
        * @Space Complexity: O(1)
        * Worst case: O(n^2) (if the array is already sorted in descending order)
        * Best case: O(n) (if the array is already sorted in ascending order)
        * Average case: O(n^2) (random nums)
        
    */
    static void insertion(int[] arr) {

        // using a pointer i to traverse thru the array
        for (int i = 0; i < arr.length - 1; i++) {
            // using a pointer j to traverse thru the array but in reverse order from which i has traversed
            for (int j = i + 1; j > 0; j--) {
                // if the element at j is less than the element at j-1, swap them
                // ie if the next element is smaller than the previous element then swap them
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                }
                // if the element at j is greater than the element at j-1, break out of the loop
                else {
                    break;
                }
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
