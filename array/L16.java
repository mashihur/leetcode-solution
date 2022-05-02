package array;

import java.util.Arrays;

/*
 * Suggested interview question
 * LeetCode Difficulty: Medium
 * My Judgement: Medium, extension of L15
 */
public class L16 {
    public int threeSumClosest(int[] nums, int target) {
        int closestSum = nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);
        int i, j, k, sum;
        for (i = 0; i < nums.length - 2; i++) {
            // if (i != 0 && nums[i - 1] == nums[i]) {
            //     continue;
            // }
            j = i + 1;
            k = nums.length - 1;
            while(j < k) {
                sum = nums[i] + nums[j] + nums[k];
                if (Math.abs(target - sum) < Math.abs(target - closestSum)) {
                    closestSum = sum;
                }
                if (sum == target) {
                    return sum;
                } else if (sum > target) {
                    k--;
                } else {
                    j++;
                }
            }
        }

        return closestSum;
    }
}
