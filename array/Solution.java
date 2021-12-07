package array;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/*
 * L384
 * LeetCode Difficulty: Medium
 * My Judgement: Medium
 */
public class Solution {
    int[] ar;

    public Solution(int[] nums) {
        ar = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ar[i] = nums[i];
        }
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return ar;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int[] numbers = new int[ar.length];
        for (int i = 0; i < ar.length; i++) {
            numbers[i] = ar[i];
        }
        Random random = ThreadLocalRandom.current();
        for (int i = numbers.length - 1; i > 0; i--) {
            int temp = random.nextInt(i + 1);
            int number = numbers[i];
            numbers[i] = numbers[temp];
            numbers[temp] = number;
        }
        return numbers;
    }
}
