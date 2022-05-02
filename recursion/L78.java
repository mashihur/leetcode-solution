package recursion;

import java.util.ArrayList;
import java.util.List;

/*
 * Company : Google, Facebook, Amazon, Microsoft, Bloomberg
 * LeetCode Difficulty: Medium
 * My Judgement: Medium
 */
public class L78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> outputList = new ArrayList<List<Integer>>();
        generateSubsets(nums, outputList, new ArrayList<Integer>(), 0);
        return outputList;
    }

    private void generateSubsets(int[] nums, List<List<Integer>> outputList, ArrayList<Integer> list, int index) {

        outputList.add(new ArrayList<Integer>(list));

        for (int i = index; i < nums.length; i++) {
            list.add(nums[i]);
            generateSubsets(nums, outputList, list, i + 1);
            list.remove((Integer) nums[i]);
        }
    }
}
