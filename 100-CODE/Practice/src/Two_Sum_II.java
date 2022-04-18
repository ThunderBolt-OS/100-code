import java.util.ArrayList;
import java.util.Arrays;

class Two_Sum_II {
    public static void main(String[] args) {
        int[] num = {2,3,4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(num, target)));
    }

    static int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        for (int index = 0; index < numbers.length; index++) {
            int temp = numbers[index];
            int j = 0;
            while(j < numbers.length){
                if ((temp + numbers[j]) == target){
                    ans[1] = index+1;
                    ans[0] = j+1;
                    break;
                }else{
                    j++;
                }

            }


        }return ans;
    }
}