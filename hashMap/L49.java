package hashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
 * Company : Amazon, Facebook, Bloomber, Yelp, Uber
 * LeetCode Difficulty: Medium
 * My Judgement: Medium
 */
public class L49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str : strs) {
            char[] ar = str.toCharArray();
            Arrays.sort(ar);
            String temp = String.valueOf(ar);
            if (!map.containsKey(temp)) {
                map.put(temp, new ArrayList<String>());
            }
            map.get(temp).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
