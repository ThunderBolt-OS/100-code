package Recursion.Sorting;

import java.util.Arrays;

public class MergeSort  {
    public static void main(String[] args) {
        int[] arr = {1, 8, 4, 5, 2, 3, 9};
        arr = mergesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergesort(int[] arr){
        if (arr.length == 1){
            return arr;
        }
        int mid = arr.length / 2;

        int[] left = mergesort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergesort(Arrays.copyOfRange(arr, mid, arr.length));

        return mergearray (left, right);
    }
    private static int[] mergearray (int[] first, int[] second){

        int[] merge = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length){
            if (first[i] < second[j]){
                merge[k] = first[i];
                i++;
            }else{
                merge[k] = second[j];
                j++;
            }
            k++;
        }
        while (i < first.length){
            merge[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length){
            merge[k] = second[j];
            j++;
            k++;
        }
        return merge;
    }
}
