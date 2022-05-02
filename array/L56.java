package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Company: Microsoft
 * LeetCode Difficulty: Medium
 * My Judgement: Medium
 * Time Complexity : O(N log N), N is the number of intervals
 * Space Complexity : O(s),  s is total number of entry in intervals
 */
public class L56 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> list = new ArrayList<int[]>();
        int[] temp = null;
        int i, max = 0;
        for(i = 0; i < intervals.length; i++) {
            if (temp == null) {
                temp = new int[2];
                temp[0] = intervals[i][0];
            }
            max = Math.max(max, intervals[i][1]);
            if (i == intervals.length - 1 || max < intervals[i + 1][0]) {
                temp[1] = max;
                list.add(temp);
                temp = null;
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}
