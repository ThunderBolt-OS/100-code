//https://leetcode.com/problems/valid-perfect-square/

class Valid_Perfect_Square {
    public static void main(String[] args) {
        int num = 9;
        System.out.println(isPerfectSquare(num));
    }
// using binary search to check valid square

    static boolean isPerfectSquare(int num) {
        if(num == 0){
            return false;
        }
        long start = 0;
        long end = num;
        long mid = 0;
        while(start <= end){
            mid = start + (end-start)/2;
            if (mid*mid == num){
                return true;
            }
            else if (mid*mid < num){
                start = mid+1;
            }
            else if (mid*mid > num){
                end = mid-1;
            }

        }return false;
        
    }
}