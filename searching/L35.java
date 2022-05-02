package searching;

/*
 * LeetCode Difficulty: easy
 * My Judgement: easy
 */
public class L35 {
    public int searchInsert(int[] nums, int target) {
        int index = nums.length, low = 0, high = nums.length - 1, mid;
        while(high >= low) {
            mid = (low + high) / 2;
            if (target > nums[mid]) {
                low = mid + 1;
            } else {
                index = mid;
                high = mid - 1;
            }
        }
        return index;
    }
}
