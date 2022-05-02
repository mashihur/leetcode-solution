package searching;

import java.util.Arrays;


/*
 * Company : Suggested Interview Question
 * LeetCode Difficulty: Medium
 * My Judgement: Hard
 */
public class L33 {
    public int search(int[] nums, int target) {
        int output, minIndex;
        minIndex = findMin(nums);
        if (target >= nums[minIndex] && target <= nums[nums.length - 1]) {
            output = Arrays.binarySearch(nums, minIndex, nums.length, target);
        } else {
            output = Arrays.binarySearch(nums, 0, minIndex, target);
        }
        return (output >= 0) ? output : -1;
    }

    public int findMin(int[] nums) {
        int low = 0, high = nums.length - 1, mid;
        while(high >= low) {
            mid = (low + high) / 2;
            if (mid == 0) {
                if (nums.length == 1) {
                    return 0;
                } else {
                    return (nums[0] < nums[1]) ? 0 : 1;
                }
            } else if (nums[mid] < nums[mid - 1]) {
                return mid;
            }
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return 0;
    }
//    public int search(int[] nums, int target) {// First approach
//        int low = 0, high = nums.length - 1, mid, result;
//        while(high >= low) {
//            mid = (low + high) / 2;
//            if (nums[low] <= nums[mid]) { // <= is used for nums.length == 2
//                if (target >= nums[low] && target <= nums[mid]) {
//                    result = Arrays.binarySearch(nums, low, mid + 1, target);
//                    return (result < -1) ? -1 : result;
//                } else {
//                    low = mid + 1;
//                }
//            } else {
//                if (target >= nums[mid] && target <= nums[high]) {
//                    result = Arrays.binarySearch(nums, mid, high + 1, target);
//                    return (result < -1) ? -1 : result;
//                } else {
//                    high = mid - 1;
//                }
//            }
//        }
//        return -1;
//    }
}
