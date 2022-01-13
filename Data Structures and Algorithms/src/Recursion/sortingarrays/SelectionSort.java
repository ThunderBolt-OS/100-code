package Recursion.sortingarrays;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        selectionsort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionsort (int[] arr, int row, int col, int max) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            if (arr[col] > arr[max]){
                selectionsort(arr, row, col+1, col);
            }else {
                selectionsort(arr, row, col+1, max);
            }
        } else {
//            swap wid last index
            int temp = arr[max];
            arr[max] = arr[row-1];
            arr[row-1] = temp;

            selectionsort(arr, row-1, 0, 0);
        }
    }
}
