package Recursion;

public class CountZeros {
    public static void main(String[] args) {
        System.out.println(Count(1001));
    }

    static int Count(int num){
        return helper(num, 0);
    }
    static int helper(int num, int c){
        if (num == 0){
            return c;
        }
        int rem = num % 10;
        if (rem == 0){
            return helper(num/10, c+1);
        }
        return helper(num/10, c);
    }
}
