class Jump_Game {
    public static void main(String[] args) {
        int[] nums = {0};
//        boolean ans = ;
        System.out.println(canJump(nums));
    }

    static boolean canJump(int[] nums) {
        int maxjump = nums[0];
        for (int i = 0; i <= maxjump ; i++) {
            if (maxjump >= (nums.length-1)){
                return true;
            }
            if (maxjump < i+nums[i]){
                maxjump = i+nums[i];
            }


        }return false;

    }
}