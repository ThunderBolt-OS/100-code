package Recursion;

public class Reverse_Digits {
    public static void main(String[] args) {
        reverse1(1234);
        System.out.println(sum);

    }
//    METHOD 1
    static int sum = 0;
    static void reverse1(int num){
        if (num == 0){
            return;
        }
        int rem = num%10;
        sum = sum*10 + rem;
        reverse1(num/10);
    }
}
