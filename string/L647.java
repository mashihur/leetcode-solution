package string;

/*
 * Company : Facebook, Linkedin
 * LeetCode Difficulty: Medium
 * My Judgement: Medium - similar problem L5
 */
public class L647 {
    public int countSubstrings(String s) {
        int count = s.length();
        for (int i = 1; i < s.length(); i++) {
            count += countMatchedChars(s, i - 1, i);
            count += countMatchedChars(s, i - 1, i + 1);
        }
        return count;
    }

    private int countMatchedChars(String str, int left, int right) {
        int count = 0;
        while(left >= 0 && right < str.length()) {
            if (str.charAt(left) != str.charAt(right)) {
                break;
            }
            count++;
            left--;
            right++;
        }
        return count;
    }
}
