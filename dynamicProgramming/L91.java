package dynamicProgramming;

/*
 * Company : Google, Microsoft, Amazon
 * LeetCode Difficulty: Medium
 * My Judgement: Medium
 * Time Complexity : O(n)
 * Space Complexity : O(s)
 */
public class L91 {
    public int numDecodings(String s) {
        if (s.charAt(0) == '0') {
            return 0;
        }
        int count = 0, i;
        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (i = 2; i <= s.length(); i++) {
            char temp = s.charAt(i - 1);
            // if (temp >= '1' && temp <= '9') {
            if (temp > '0') {
                dp[i] = dp[i - 1];
            }
            char temp2 = s.charAt(i - 2);
            // if ((temp2 == '1' && (temp >= '0' && temp <= '9')) || (temp2 == '2' && (temp >= '0' && temp <= '6'))) {
            if (temp2 == '1' || (temp2 == '2' && temp <= '6')) {
                dp[i] += dp[i - 2];
            }
        }

        return dp[s.length()];
    }

    // public int numDecodings(String s) {
    //    int n = s.length();
    //     // a = f[i-2], b = f[i-1], c=f[i]
    //     int a = 0, b = 1, c = 0;
    //     for (int i = 1; i <= n; ++i) {
    //         c = 0;
    //         if (s.charAt(i - 1) != '0') {
    //             c += b;
    //         }
    //         if (i > 1 && s.charAt(i - 2) != '0' && ((s.charAt(i - 2) - '0') * 10 + (s.charAt(i - 1) - '0') <= 26)) {
    //             c += a;
    //         }
    //         a = b;
    //         b = c;
    //     }
    //     return c;
    // }
}
