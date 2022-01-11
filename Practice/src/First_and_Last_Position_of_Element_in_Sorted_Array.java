// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

import java.util.Arrays;

class First_and_Last_Position_of_Element_in_Sorted_Array {
    public static void main(String[] args) {
        int[] nums ={5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        int startIndex = search(nums, target, true);
        int endIndex = search(nums, target, false);

        ans[0] = startIndex;
        ans[1] = endIndex;

        return ans;
    }
     static int search (int[] nums, int target, boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        while (start <= end){
            int mid = start + (end-start)/2;
            if (target < nums[mid]){
                end = mid-1;
            }else if (target > nums[mid]){
                start = mid+1;
            }else {
                ans = mid; //our potential ans is found
                if (findStartIndex){
                    end = mid-1; // to find the start
                }else {
                    start = mid+1; // to find the end
                }
            }

        }return ans;
    }
}