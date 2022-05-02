package recursion;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode Difficulty: Medium
 * My Judgement: Medium
 */
public class L46 {
    public List<List<Integer>> permute(int[] nums) {
        return computePermutation(nums, new ArrayList<Integer>(), new ArrayList<List<Integer>>());
    }

    private List<List<Integer>> computePermutation(int[] a, List<Integer> list, List<List<Integer>> permuteList) {
        if (list.size() == a.length) {
            permuteList.add(new ArrayList<>(list));
        } else {
            for (int i = 0; i < a.length; i++) {
                if (list.contains(a[i])) {
                    continue;
                }
                list.add(a[i]);
                computePermutation(a, list, permuteList);
                list.remove((Integer)a[i]);
            }
        }
        return permuteList;
    }
}
