package tree;

/*
 * Company : Google, Apple
 * LeetCode Difficulty: Easy
 * My Judgement: Medium
 */
public class L108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    private TreeNode helper(int[] nums, int low, int high) {
        TreeNode node = null;
        if (low <= high) {
            int mid = (low + high) / 2;
            node = new TreeNode(nums[mid]);
            node.left = helper(nums, low, mid - 1);
            node.right = helper(nums, mid + 1, high);
        }
        return node;
    }
}
