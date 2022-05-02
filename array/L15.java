package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Suggested interview question
 * LeetCode Difficulty: Medium
 * My Judgement: Medium
 */
public class L15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> outputList = new ArrayList<List<Integer>>();
        if (nums.length > 2) {
            Arrays.sort(nums);
            int i, j, k, sum;
            for (i = 0; i < nums.length - 2; i++) {
                if (i != 0 && nums[i - 1] == nums[i]) {
                    continue;
                }
                j = i + 1;
                k = nums.length - 1;
                while(j < k) {
                    sum = nums[i] + nums[j] + nums[k];
                    if (sum == 0) {
                        outputList.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        j++;
                        while(j < k && nums[j - 1] == nums[j]) {
                            j++;
                        }
                    } else if (sum > 0) {
                        k--;
                    } else {
                        j++;
                    }
                }
            }
        }

        return outputList;
    }

//     public List<List<Integer>> threeSum(int[] nums) {
//         HashSet<List<Integer>> outputSet = new HashSet<List<Integer>>();
//         int i, j;
//         HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//         Arrays.sort(nums);
//         for (i = 2; i < nums.length; i++) {
//             map.put(nums[i], i);
//         }
//         for (i = 0; i < nums.length - 1; i++) {
//             for (j = i + 1; j < nums.length; j++) {
//                 Integer index = map.get(-nums[i] - nums[j]);
//                 if (index != null && index > j) {
//                     List<Integer> list = new ArrayList<Integer>();
//                     list.add(nums[i]);
//                     list.add(nums[j]);
//                     list.add(-nums[i] - nums[j]);
//                     outputSet.add(list);
//                 }
//             }
//         }

//         return new ArrayList<List<Integer>>(outputSet);
//     }
}
