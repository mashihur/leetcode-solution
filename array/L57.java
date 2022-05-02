package array;

import java.util.ArrayList;
import java.util.List;

/*
 * Company: Microsoft
 * LeetCode Difficulty: Medium
 * My Judgement: Medium
 * Time Complexity : O(n), n is the number of intervals
 * Space Complexity : O(s), s is total number of entry in intervals
 */
public class L57 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<int[]>();
        int i;
        for (i = 0; i < intervals.length; i++) {
            if (intervals[i][1] < newInterval[0]) {
                list.add(intervals[i]);
            } else if (newInterval[1] < intervals[i][0]) {
                break;
            } else {
                newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            }
        }
        list.add(newInterval);
        while(i < intervals.length) {
            list.add(intervals[i++]);
        }
        return list.toArray(new int[list.size()][]);
    }
}
