package Linkedlists;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(12));
    }
    static boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = getSquare(slow);
            fast = getSquare(getSquare(fast));

        }while (slow != fast);
        if (slow == 1){
            return true;
        }
        return false;
    }
    private static int getSquare(int num){
        int ans = 0;
        while (num > 0){
            int rem = num % 10;
            ans += rem * rem ;
            num /= 10;
        }
        return ans;
    }
}
