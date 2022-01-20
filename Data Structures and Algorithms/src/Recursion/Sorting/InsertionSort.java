package Recursion.Sorting;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 2, 4};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int[] arr){           // returns void as we are changing elements of same array itself
        for (int i = 0; i < arr.length-1; i++) {   //1st pointer points to every index, after every i increment 0 to i array is sorted
            for (int j = i+1; j > 0 ; j--) {       // 2nd pointer points to i+1 and runs reverse
                if (arr[j] < arr[j-1]){            // it swaps the value if next element is smaller than current
                    swap(arr, j, j-1);
                }
                else{
                    break;
                }
            }
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
