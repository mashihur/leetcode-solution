package array;

/*
 * Company : Suggested Interview Question
 * LeetCode Difficulty: Easy
 * My Judgement: Easy
 */
public class L121 {
    public int maxProfit(int[] prices) {
        int i, buy = prices[0], profit = 0;
        for (i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else if ((prices[i] - buy) > profit) {
                profit = prices[i] - buy;
            }
        }
        return profit;
    }
}
