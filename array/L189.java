package array;

/*
 * Company : Microsoft, Amazon, Bloomberg
 * LeetCode Difficulty: Medium
 * My Judgement: Medium
 * Time Complexity : O(n)
 * Space Complexity : O(1)
 */
public class L189 {

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }

        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }


    // public void rotate(int[] nums, int k) {
    //     int i, n = nums.length;
    //     if (k > n)
    //         k = k % n;
    //     int[] temp = new int[k];
    //     for (i = n - k; i < n; i++) {
    //         temp[i - n + k] = nums[i];
    //     }
    //     for (i = n - k - 1; i >= 0; i--) {
    //         nums[i + k] = nums[i];
    //     }
    //     for (i = 0; i < k; i++) {
    //         nums[i] = temp[i];
    //     }
    // }
}
