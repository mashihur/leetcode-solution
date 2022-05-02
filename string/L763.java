package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * Company : Amazon
 * LeetCode Difficulty: Medium
 * My Judgement: Medium
 * Time Complexity : O(N), N is the length of s
 * Space Complexity : O(1), Need array of size 26
 */
public class L763 {

    public List<Integer> partitionLabels(String s) {
        List<Integer> list = new ArrayList<Integer>();
        int[] positions = new int[26];
        for (int i = 0; i < s.length(); i++) {
            positions[s.charAt(i) - 'a'] = i;
        }
        int currentPos = 0, max = 0;
        for (int i = 0; i < s.length(); i++) {
            max = Math.max(max, positions[s.charAt(i) - 'a']);
            if (i == max) {
                list.add(i - currentPos + 1);
                currentPos = i + 1;
            }
        }

        return list;
    }

//    public List<Integer> partitionLabels(String s) { // My first approach
//        List<Integer> list = new ArrayList<Integer>();
//        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
//        for (Character c : s.toCharArray()) {
//            map1.put(c, map1.getOrDefault(c, 0) + 1);
//        }
//
//        HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
//        int prevIndex = 0;
//        for (int i = 0; i < s.length(); i++) {
//            Character c = s.charAt(i);
//            map2.put(c, map2.getOrDefault(c, 0) + 1);
//            if (compareMaps(map1, map2)) {
//                list.add(i + 1 - prevIndex);
//                prevIndex = i + 1;
//            }
//        }
//        return list;
//    }
//
//    private boolean compareMaps(HashMap<Character, Integer> map1, HashMap<Character, Integer> map2) {
//        for (Character c : map2.keySet()) {
//            if (map1.get(c) != map2.get(c)) {
//                return false;
//            }
//        }
//        return true;
//    }
}
