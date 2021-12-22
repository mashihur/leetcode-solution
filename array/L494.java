package array;

/*
 * Company : Google, Facebook
 * LeetCode Difficulty: Medium
 * My Judgement: Medium - Can be solved using dynamic programming 
 */
public class L494 {

    public int findTargetSumWays(int[] nums, int S) {
        return calculateSum(nums, S, 0, 0, 0);
    }

    private int calculateSum(int[] nums, int S, int index, int currentSum, int count) {
        if(index == nums.length) {
            if (currentSum == S) {
                return count + 1;
            } else {
                return count;
            }
        }

        return calculateSum(nums, S, index + 1, currentSum - nums[index], count) + calculateSum(nums, S, index + 1, currentSum + nums[index], count);
    }
}
