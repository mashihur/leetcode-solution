package array;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

/*
 * LeetCode Difficulty: Medium
 * My Judgement: Easy
 */
public class L215 {

    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    // public int findKthLargest(int[] nums, int k) { //Not the best solution
    //     PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
    //     for (int value : nums) {
    //         heap.add(value);
    //         if (heap.size() > k) {
    //             heap.poll();
    //         }
    //     }
    //     return heap.poll();
    // }
}
