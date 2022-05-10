package Sorting;

import java.util.Arrays;

public class PracticeHeapsort {
    public static void main(String[] args) {
        int[] nums = { 5, 4, 3, 2, 1 };
        heap(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void heap(int[] arr) {
        int n = arr.length;
        // creating the heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // now sorting the array
        for (int i = n - 1; i >= 0; i--) {
            swap(arr, 0, i);
            heapify(arr, i, 0);
        }
    }

    public static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        // checking if the left child is greater or not
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

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
