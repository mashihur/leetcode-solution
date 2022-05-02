package array;

/*
 * Suggested Interview Question
 * LeetCode Difficulty: Medium
 * My Judgement: Medium
 * Time Complexity : O(N), N is the length of array
 * Space Complexity : O(1)
 * Similar problem L45
 */
public class L55 {
    public boolean canJump(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        int max = 0, i;
        for (i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0 && max <= i) {
                return false;
            }
            max = Math.max(max, i + nums[i]);
            if (max >= nums.length - 1) {
                return true;
            }
        }
        return false;
    }
}
