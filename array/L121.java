package array;

/*
 * Company : Amazon 54, Google 11, Facebook 10, Microsoft 20, Apple 12, Adobe 13
 * LeetCode Difficulty: Easy
 * My Judgement: Easy
 * Time Complexity: O(N)
 * Space Complexity: O(1)
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
