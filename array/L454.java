package array;

import java.util.HashMap;

/*
 * LeetCode Difficulty: Medium
 * My Judgement: Medium
 */
public class L454 {

    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int count = 0, index1, index2, len = A.length;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (index1 = 0; index1 < len; index1++) {
            for (index2 = 0; index2 < len; index2++) {
                map.put(A[index1] + B[index2], map.getOrDefault(A[index1] + B[index2], 0) + 1);
            }
        }
        for (index1 = 0; index1 < len; index1++) {
            for (index2 = 0; index2 < len; index2++) {
                count += map.getOrDefault(-1 * (C[index1] + D[index2]), 0);
            }
        }

        return count;
    }

}
