

public class Stream {
    public static void main(String[] args) {
        // skip("", "aabaaasdfraa");
        System.out.println(skipString("wersdfaapplewergsle"));
    }
    
    //    function to skip all the 'a' in a string
    //    creating a func that takes parameters as
    //    1. current result (ie empty or half processed or processed to any extent by user)
    //    2. giving our string on which operation shall take place
    static void skip(String processed, String Unprocessed) {
        // if unprocessed string is empty then return the processed argument
        if (Unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        char ch = Unprocessed.charAt(0);

        //if the first character of unprocessed string is 'a' then skip it and call the function again
        if (ch == 'a') {
            //here substring is used to remove the first character ie in a recurssion call
            // agar 'a' agaya after we keep in cropping  of the string
            skip(processed, Unprocessed.substring(1));
        }
        //else add the first character of unprocessed string to the processed string
        //and call the function again
        else {
            skip(processed + ch, Unprocessed.substring(1));
        }

    }
    // skippig an entire string
    static String skipString(String Unprocessed) {
        if (Unprocessed.isEmpty()) {
            return "";
        }

        if (Unprocessed.startsWith("apple")) {
            return skipString(Unprocessed.substring(5));
        } else {
            return Unprocessed.charAt(0) +  skipString(Unprocessed.substring(1));
        }
    }

}
