import java.util.Arrays;

class Rotate_Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        rotate(arr, 3);

    }

    static void rotate(int[] nums, int k) {
        int times = nums.length-1;
        for (int i = 0; i < k ; i++) {
            for (int index = times; index >= 0; index--) {
                swap(nums, (times), (times-1));
            }

        }
        System.out.println("Rotated Array: "+ Arrays.toString(nums));
    }
    static void swap(int[] arr, int first, int second){
        for (int i = 0; i < arr.length ; i++) {
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }

    }
}