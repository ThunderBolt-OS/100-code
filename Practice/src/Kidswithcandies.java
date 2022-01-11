import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Kidswithcandies {
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6};
//        int extra = 3;
//        boolean[] ans = kidsWithCandies(arr, extra);
//        System.out.println(Arrays.toString());
//
//    }
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        List ans = new ArrayList<>();
//        now to find the highes in array candies
        int max = 0;

        for (int index = 0; index < candies.length ; index++) {
            if (max < candies[index]){
                max = candies[index];
            }
        }
//        now to compare max to every element of array candies
        for (int j = 0; j < candies.length ; j++) {
            if ((extraCandies + candies[j]) >= max ){
                ans.add(true);
            }else{
                ans.add(false);
            }

        } return ans;
    }


//    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
//
//    }
}