package Recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    static int factorial(int N){

       if (N==1 || N==0){
            return 1;
        }
        return N * factorial(N-1);

    }
}
