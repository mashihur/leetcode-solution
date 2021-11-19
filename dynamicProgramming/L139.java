package dynamicProgramming;

import java.util.List;

/*
 * LeetCode Difficulty: Medium
 * My Judgement: Hard - DP - Similar but harder problem L140
 */
public class L139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        int index = 0, length = s.length(), maxDictLength = getMaxLength(wordDict), temp;
        boolean[] dp = new boolean[length + 1];
        dp[0] = true;
        for (index = 1; index <= length; index++) {
            for (int i = 1; i <= maxDictLength; i++) {
                temp = index - i;
                if (temp < 0) {
                    break;
                }
                if (wordDict.contains(s.substring(temp, index)) && dp[temp]) {
                    dp[index] = true;
                    break;
                }
            }
        }
        return dp[length];
    }

    private int getMaxLength(List<String> dict) {
        int max = 0;
        for(String s : dict) {
            max = Math.max(max,s.length());
        }
        return max;
    }

//    public boolean wordBreak(String s, List<String> wordDict) { // This approach is little slower
//        int index = 0, length = s.length(), maxDictLength = getMaxLength(wordDict);
//        List<Integer> posList = new ArrayList<Integer>();
//
//        for (index = 1; index <= length; index++) {
//        	if (index <= maxDictLength && wordDict.contains(s.substring(0, index))) {
//        		posList.add(index);
//        	} else {
//        		for (int pos : posList) {
//        			if (index - pos <= maxDictLength && wordDict.contains(s.substring(pos, index))) {
//                		posList.add(index);
//                		break;
//                	}
//        		}
//        	}
//        }
//        return posList.contains(length);
//    }
}
