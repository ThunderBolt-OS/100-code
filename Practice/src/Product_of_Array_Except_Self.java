

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

class Product_of_Array_Except_Self {
    public static void main(String[] args) {
        int[] ans = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(ans)));
    }

    static int[] productExceptSelf(int[] nums) {

        int[] ans = new int[nums.length];
        for(int i=0, temp=1; i<nums.length; i++){
            ans[i] = temp;
            temp *= nums[i];
//             1->1->2->6
        }
        for (int i = nums.length-1, temp = 1; i>=0  ; i--) {
            ans[i] *= temp;
            temp *= nums[i];


        }
        return ans;
    }
}

