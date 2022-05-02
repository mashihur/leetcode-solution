package string;

import java.util.HashMap;
import java.util.HashSet;

/*
 * Company : Adobe, Amazon, Bloomberg, Yelp
 * LeetCode Difficulty: Medium
 * My Judgement: Medium
 */
public class L3 {

    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<Character>();
        int right, count = 0, left = 0;
        for (right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            while(set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
            count = Math.max(count, set.size());
        }
        return count;
    }

//    public int lengthOfLongestSubstring(String s) { // Little better time complexity but harder
//        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
//        int count = 0, sum = 0, i ;
//        for (i = 0; i < s.length(); i++) {
//            char temp = s.charAt(i);
//            if (!map.containsKey(temp)) {
//                map.put(temp, i);
//            } else {
//                if (sum < (i - count)) {
//                    sum = i - count;
//                }
//                count = Math.max(count, map.get(temp) + 1);
//                map.put(temp, i);
//            }
//        }
//        sum = Math.max(sum, i - count);
//
//        return sum;
//    }
}
