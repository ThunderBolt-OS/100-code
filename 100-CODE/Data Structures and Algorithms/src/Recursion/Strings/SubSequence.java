import java.util.ArrayList;
import java.util.Arrays;

public class SubSequence {
    public static void main(String[] args) {
        // System.out.println(subseqArray("", "abc"));
        System.out.println(subseqArrayAscii("", "abc"));
        // subseqAscii("", "abc");
    }
    
    // !function to print all the permutations of a string
    static void subseq(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);

        // now we are making two decisions that is, either to take the first character or not
        // if we take the first character then we will call the function again
        subseq(ch + processed, unprocessed.substring(1));
        // if we don't take the first character then we will call the function again
        subseq(processed, unprocessed.substring(1));
    }
    
    // !creating a function that returns a array of strings
    static ArrayList<String> subseqArray(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            ArrayList<String> result = new ArrayList<>();
            result.add(processed);
            return result;
        }

        char ch = unprocessed.charAt(0);
        // now we are making two arrays as left and right which represents the decisions, 
        // ie either to take the first character or not
        ArrayList<String> left = subseqArray(ch + processed, unprocessed.substring(1));
        ArrayList<String> right = subseqArray(processed, unprocessed.substring(1));

        // now we are merging the left and right arrays
        left.addAll(right);
        // returning the merged array, you can return either left or right both are same now
        return left;
    }

    //!creating a functino that would also give an ascii value as a permutation
    static void subseqAscii(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);

        subseqAscii(ch + processed, unprocessed.substring(1));
        subseqAscii(processed, unprocessed.substring(1));
        subseqAscii(processed + (ch + 0), unprocessed.substring(1));

    }
    
    static ArrayList<String> subseqArrayAscii(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            ArrayList<String> result = new ArrayList<>();
            result.add(processed);
            return result;
        }

        char ch = unprocessed.charAt(0);
        // now we are making two arrays as left and right which represents the decisions, 
        // ie either to take the first character or not
        ArrayList<String> first = subseqArrayAscii(ch + processed, unprocessed.substring(1));
        ArrayList<String> second = subseqArrayAscii(processed, unprocessed.substring(1));
        ArrayList<String> third = subseqArrayAscii(processed + (ch+0), unprocessed.substring(1));


        // now we are merging the left and right arrays
        first.addAll(second);
        first.addAll(third);
        // returning the merged array, you can return either left or right both are same now
        return first;
    }
    
}
