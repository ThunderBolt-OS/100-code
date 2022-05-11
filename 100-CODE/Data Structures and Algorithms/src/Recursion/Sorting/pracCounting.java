public class pracCounting{

    public static void main(String args[]){
        int[] array = {5, 4, 3, 2, 1};
        countsort(array, array.length);
        System.out.println(Arrays.toString(array));
    }

    public static void countsort(int[] array, int size) {
        int[] output = new int[size + 1];

        // finding the max element from array
        int max = array[0];
        for (int i = 0; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        int[] count = new int[max + 1];

        // now initializing all the values of count to zero
        for (int i = 0; i <= max; i++) {
            count[i] = 0;
        }

        // calculating the frequency of the elements in array
        for (int i = 0; i < size; i++) {
            count[array[i]]++;
        }

        // storing the cumulative count of each element
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        // now finding the index of element in the output arr in count array and place elements in the output array
        for (int i = size - 1; i >= 0; i--) {
            output[count[array[i]] - 1] = array[i];
            count[array[i]]--;
        }

        // now placing the elements of output array in the origin array
        for (int i = 0; i < size; i++) {
            array[i] = output[i];
        }

    }
}