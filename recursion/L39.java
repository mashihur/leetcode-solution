package recursion;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode Difficulty: Medium
 * My Judgement: Medium
 */
public class L39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> outputList = new ArrayList<List<Integer>>();
        generateCombinations(candidates, new ArrayList<Integer>(), outputList, target, 0, 0);
        return outputList;
    }

    private void generateCombinations(int[] a, List<Integer> list, List<List<Integer>> outputList, int target, int index, int sum) {
        if (sum > target) {
            return;
        }
        if (sum == target) {
            outputList.add(new ArrayList<>(list));
            return;
        }
        for (int i = index; i < a.length; i++) {
            list.add(a[i]);
            generateCombinations(a, list, outputList, target, i, sum + a[i]);
            list.remove((Integer)a[i]);
        }

    }
}
