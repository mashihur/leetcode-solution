package searching;

import java.util.Arrays;

/*
 * Company : LinkedIn
 * LeetCode Difficulty: Medium
 * My Judgement: Medium
 */
public class L34 { // Both the solution, same complexity

    public int[] searchRange(int[] nums, int target) {
        int[] result =  {-1, -1};
        int lPosition = Arrays.binarySearch(nums, target);
        int rPositon = lPosition;
        if (lPosition < 0) {
            return result;
        }
        while(lPosition >= 0) {
            result[0] = lPosition;
            lPosition = Arrays.binarySearch(nums, 0, result[0], target);
        }
        while(rPositon >= 0) {
            result[1] = rPositon;
            rPositon = Arrays.binarySearch(nums, result[1] + 1, nums.length, target);
        }

        return result;
    }

//     public int[] searchRange(int[] nums, int target) {
//         int[] result =  {-1, -1};

//         // if (nums.length == 0) {
//         //     return result;
//         // }

//         int low = 0, high = nums.length - 1, mid;

//         while(high >= low) {
//             mid = (low + high) / 2;
//             if (target > nums[mid]) {
//                 low = mid + 1;
//             } else if (target < nums[mid]) {
//                 high = mid -1;
//             } else {
//                 result[0] = mid;
//                 high = mid - 1;
//             }
//         }

//         if (result[0] == -1) {
//             return result;
//         }

//         low = result[0];
//         high = nums.length - 1;

//         while(high >= low) {
//             mid = (low + high) / 2;
//             if (target > nums[mid]) {
//                 low = mid + 1;
//             } else if (target < nums[mid]) {
//                 high = mid -1;
//             } else {
//                 result[1] = mid;
//                 low = mid + 1;
//             }
//         }

//         return result;
//     }

}
