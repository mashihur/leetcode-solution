package array;

import java.util.Arrays;

/*
 * Suggested Interview Question
 * LeetCode Difficulty: Medium
 * My Judgement: Medium
 * Time Complexity : O(n log n), n is the number of intervals
 * Space Complexity : O(1)
 * Similar Question: L57
 */
public class L435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        int count = 0, i;
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        for(i = 1; i < intervals.length; i++) {
            if (intervals[i - 1][1] > intervals[i][0]) {
                intervals[i][1] = Math.min(intervals[i - 1][1], intervals[i][1]);
                count++;
            }
        }

        return count;
    }
}
