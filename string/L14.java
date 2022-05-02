package string;

/*
 * LeetCode Difficulty: Easy
 * My Judgement: Easy
 */
public class L14 {

    public String longestCommonPrefix(String[] strs) { // Not the best approach
        int count, len, i, j;
        len = count = strs[0].length();
        for (i = 1; i < strs.length; i++) {
            len = (len < strs[i].length()) ? len : strs[i].length();
            for (j = 0; j < len; j++) {
                if (strs[0].charAt(j) != strs[i].charAt(j)) {
                    break;
                }
            }
            if (j < count) {
                count = j;
            }
        }
        return strs[0].substring(0, count);
    }
}
