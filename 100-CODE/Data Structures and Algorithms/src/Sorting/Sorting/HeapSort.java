package Sorting;

import java.util.*;

public class HeapSort {
    public static void main(String[] args) {
        int[] nums = { 23, 7, 18, 10 };
        heap(nums);
        System.out.println(Arrays.toString(nums));
    }
    
    /*
     * @param nums: An integer array
     * @return: void
     
     * @Description: Heap Sort 
     * @Time Complexity: O(n*log(n))
     * @Space Complexity: O(1)
     * Worst case: O(n*log(n)) (if the array is already sorted in descending order)
     * Best case: O(n*log(n)) (if the array is already sorted in ascending order)
     * Average case: O(n*log(n)) (random nums)
     
    */ 

    public static void heap(int[] arr) {
        // build the heap
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            heapify(arr, arr.length, i);
        }

        // sort the heap
        for (int i = arr.length - 1; i >= 0; i--) {
            swap(arr, 0, i);
            heapify(arr, i, 0);
        }
    }
    
    // creating a Max heap
    public static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        // checking if the left child is greater than parent or not
        if (l < n && arr[l] > arr[largest]) {
            largest = l;
        }

        // checking if the right child is greater than parent or not
        if (r < n && arr[r] > arr[largest]) {
            largest = r;
        }

        if (largest != i) {
            swap(arr, i, largest);
            heapify(arr, n, largest);
        }
    }

    // creating a Min heap
    public static void heapifyMin(int[] arr, int n, int i) {
        int smallest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        // checking if the left child is greater than parent or not
        if (l < n && arr[l] < arr[smallest]) {
            smallest = l;
        }

        // checking if the right child is greater than parent or not
        if (r < n && arr[r] < arr[smallest]) {
            smallest = r;
        }

        if (smallest != i) {
            swap(arr, i, smallest);
            heapifyMin(arr, n, smallest);
        }
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}