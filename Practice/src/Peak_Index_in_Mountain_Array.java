// https://leetcode.com/problems/peak-index-in-a-mountain-array/

import java.util.Arrays;
class Peak_Index_in_Mountain_Array {
    public static void main(String[] args) {
        int[] arr = {24,69, 20, 99,79,78};
        System.out.println(peakIndexInMountainArray(arr));
    }

    static int peakIndexInMountainArray(int[] arr) {
        if(arr.length >= 3){
            int temp = 0;
            for (int index = 0; index < arr.length; index++) {
                if (arr[index] > arr[temp]){
                    temp = index;
                }
            }return temp;
        }

        return -1;
        
    }
}