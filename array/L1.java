package array;

import java.util.Arrays;
import java.util.HashMap;

/*
 * LeetCode Difficulty: Easy
 * My Judgement: Medium
 */
public class L1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        int i;
        int[] output = new int[2];

        for (i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]) && (i != map.get(target - nums[i]))) {
                output[0] = i;
                output[1] = map.get(target - nums[i]);
                break;
            }
        }

        return output;
    }

//    public int[] twoSum(int[] nums, int target) {
//        int[] sortedNums = Arrays.copyOf(nums, nums.length);
//        Arrays.sort(sortedNums);
//        int[] output = new int[2];
//        int length = nums.length;
//
//        for (int i = 0; i < length; i++) {
//            int index = Arrays.binarySearch(sortedNums, i + 1, length, target - sortedNums[i]);
//            if (index >= 0) {
//                output[0] = getIndex(nums, sortedNums[i], -1);
//                output[1] = getIndex(nums, sortedNums[index], output[0]);
//                break;
//            }
//        }
//        return output;
//    }
//
//    private int getIndex(int[] nums, int key, int index) {
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == key && i != index) {
//                return i;
//            }
//        }
//        return -1;
//    }
}
