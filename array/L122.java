package array;

/*
 * Company : Suggested Interview Question
 * LeetCode Difficulty: Medium
 * My Judgement: Easy - similar problem L121
 */
public class L122 {
    public int maxProfit(int[] prices) {
        int profit = 0, i;
        for (i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] > prices[i]) {
                profit += (prices[i + 1] - prices[i]);
            }
        }

        return profit;
    }
}
