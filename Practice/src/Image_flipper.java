import java.util.Arrays;

//https://leetcode.com/problems/flipping-an-image/



class Image_flipper {
    public static void main(String[] args) {
        int[][] image = {{1,1,0}, {1,0,1}, {0,0,0}};
       System.out.println(Arrays.toString(flipAndInvertImage(image)));
    }


    static int[][] flipAndInvertImage(int[][] image) {

//        to invert rows of 2d array
        for (int i = 0; i < image.length ; i++) {
            int start = 0;
            int end = image.length - 1;
            while (start < end){
                int temp = image[i][start];
                image[i][start] = image[i][end];
                image[i][end] = temp;

                start++;
                end--;
            }

        }
//        now to invert the values from 0 to 1 and vice versa
        for (int row = 0; row < image.length ; row++) {
            for (int col = 0; col <image[row].length ; col++) {

                if (image[col][row] == 0){
                    image[col][row] = 1;

                }else
                    image[col][row] = 0;
            }

        }return image;
        
    }
}