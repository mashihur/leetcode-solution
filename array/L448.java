package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/*
 * Company : Google, Microsoft
 * LeetCode Difficulty: Easy
 * My Judgement: Easy but trick is important
 */
public class L448 {

    public List<Integer> findDisappearedNumbers(int[] nums) { // without using extra space
        for (int i = 0; i < nums.length; i++) {
            int temp = Math.abs(nums[i]);
            if (nums[temp - 1] > 0) {
                nums[temp - 1] *= -1;
            }
        }
        List<Integer> outputList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                outputList.add(i + 1);
            }
        }
        return outputList;
    }

//    public List<Integer> findDisappearedNumbers(int[] nums) { // with using extra space
//        int[] temp = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            temp[nums[i] - 1] = 1;
//        }
//        List<Integer> outputList = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (temp[i] != 1) {
//                outputList.add(i + 1);
//            }
//        }
//        return outputList;
//    }

//    public List<Integer> findDisappearedNumbers(int[] nums) { // My first approach
//        List<Integer> outputList = new ArrayList<Integer>();
//        Arrays.sort(nums);
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] - count > 1) {
//                for (int index = count + 1; index < nums[i]; index++) {
//                    outputList.add(index);
//                }
//            }
//            count = nums[i];
//        }
//        for (int index = count + 1; index <= nums.length; index++) {
//            outputList.add(index);
//        }
//
//        return outputList;
//    }

}
