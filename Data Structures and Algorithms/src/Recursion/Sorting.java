package Recursion;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 4, 5 };
        System.out.println(sorting(arr, 0));
    }
    static boolean sorting(int[] arr, int index){
        if (index == arr.length-1){
            return true;
        }

        return arr[index] < arr[index+1] && sorting(arr, index+1);
    }
}
