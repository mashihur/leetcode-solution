package backtracking;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode Difficulty: Medium
 * My Judgement: Medium
 */
public class L131 {
    
    public List<List<String>> partition(String s) { //Not the best solution
        List<List<String>> partitionList = new ArrayList<>();
        generatePartitionList(partitionList, new ArrayList<String>(), 0, s);
        return partitionList;
    }

    private void generatePartitionList(List<List<String>> partitionList, List<String> partition, int pos, String s) {
        if (pos == s.length()) {
            partitionList.add(new ArrayList<>(partition));
            return;
        }
        for (int i = pos; i < s.length(); i++) {
            if (isPalindrome(s, pos, i)) {
                partition.add(s.substring(pos, i + 1));
                generatePartitionList(partitionList, partition, i + 1, s);
                partition.remove(partition.size() - 1); // possibility of Same string multiple time in list, that's why (size() - 1) param used
            }
        }
    }

    private boolean isPalindrome(String s , int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return  true;
    }
}
