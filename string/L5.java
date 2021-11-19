package string;

import org.junit.Assert;
import org.junit.Test;

/*
 * Company : Amazon, Microsoft, Bloomberg, Uber
 * LeetCode Difficulty: Medium
 * My Judgement: Medium - Problem seems easy but tricky
 */
public class L5 {

    public String longestPalindrome(String s) {
        String returnValue = s.substring(0, 1);
        char[] sArray = s.toCharArray();
        int lIndex, rIndex = 1, index;
        for (index = 1; index < s.length(); index++) {
            if (sArray[index -1 ] == sArray[index]) { // For even number palindrome
                lIndex = index - 1;
                rIndex = index;
                while(lIndex >= 0 && rIndex < s.length() && sArray[lIndex] == sArray[rIndex]) {
                    lIndex--;
                    rIndex++;
                }
                if ((rIndex - lIndex - 1) > returnValue.length()) {
                    returnValue = s.substring(lIndex + 1, rIndex);
                }
            }

            lIndex = index - 1;
            rIndex = index + 1;
            while(lIndex >= 0 && rIndex < s.length() && sArray[lIndex] == sArray[rIndex]) {
                lIndex--;
                rIndex++;
            }
            if ((rIndex - lIndex - 1) > returnValue.length()) {
                returnValue = s.substring(lIndex + 1, rIndex);
            }
        }

        return returnValue;
    }


    @Test
    public void test1() {
        Assert.assertEquals("bcdcb", longestPalindrome("abcdcbfb"));
    }

    @Test
    public void test2() {
        Assert.assertEquals("a", longestPalindrome("a"));
    }

    @Test
    public void test3() {
        Assert.assertEquals("bb", longestPalindrome("bb"));
    }

    @Test
    public void test4() {
        Assert.assertEquals("eeeeee", longestPalindrome("abcdcbfbeeeeeegh"));
    }

    @Test
    public void test5() {
        Assert.assertEquals("eeee", longestPalindrome("abcbfbeeeegh"));
    }

    @Test
    public void test6() {
        Assert.assertEquals("ccc", longestPalindrome("ccc"));
    }

}
