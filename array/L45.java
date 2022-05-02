package array;

/*
 * Suggested Interview Question
 * LeetCode Difficulty: Medium
 * My Judgement: Medium
 * Time Complexity : O(N), N is the length of array
 * Space Complexity : O(1)
 * Similar problem L55
 */
public class L45 {
    public int jump(int[] nums) {
        int max = 0, currentPos = 0, i, minJumps = 0;
        for (i = 0; i < nums.length - 1; i++) {
            max = Math.max(max, nums[i] + i);
            if (i == currentPos) {
                currentPos = max;
                minJumps++;
            }
            // if (currentPos >= nums.length - 1) {
            //     break;
            // }
        }
        return minJumps;
    }
}
