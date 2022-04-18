import java.util.Arrays;

class shuffle_array {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,4,7};
        int n = 3;
        System.out.println(Arrays.toString(shuffle(arr, n)));

    }
    static int[] shuffle(int[] nums, int n) {

        int[] ans = new int[nums.length];
        int j = 0;
        for (int index = 0; index < n ; index++) {
            ans[j] = nums[index];
            ans[j+1] = nums[n+index];
            j+=2;

        }return ans;
    }
}