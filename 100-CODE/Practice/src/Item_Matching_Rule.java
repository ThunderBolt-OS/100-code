//https://leetcode.com/problems/count-items-matching-a-rule/

import java.util.List;

class Item_Matching_Rule {
    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int  index = 0;
        int count = 0;
        if (ruleKey.equals("type")) {
            index = 0;
        } else if (ruleKey.equals("color")) {
            index = 1;
        } else {
            index = 2;
        }
        for (List<String> list : items) {
            if (list.get(index).equals(ruleValue)){
                count++;
            }
            
        }
        return count;
    }

}