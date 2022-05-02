package etc;

/*
 * Company : Google, Microsoft, Amazon, LinkedIn, Bloomberg
 * LeetCode Difficulty: easy
 * My Judgement: easy
 */
public class L70 {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int n1 = 1, n2 = 2, sum = 0, i;
        for (i = 3; i <= n; i++) {
            sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
        return sum;
    }
}
