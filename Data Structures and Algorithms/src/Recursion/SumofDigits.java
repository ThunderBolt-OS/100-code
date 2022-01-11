package Recursion;

public class SumofDigits {
    public static void main(String[] args) {
        System.out.println(SumofDigits(1234));
    }

    static int SumofDigits(int n){

        if (n == 0){
            return 0;
        }
        return (n%10) + SumofDigits(n/10);
    }
}
