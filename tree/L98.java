package tree;

/*
 * Company : Google, Facebook, Amazon, Microsoft, Bloomberg, Apple
 * LeetCode Difficulty: Medium
 * My Judgement: Hard
 */
public class L98 {
    public boolean isValidBST(TreeNode root) {
        return isValid(root, Long.MAX_VALUE, Long.MIN_VALUE);
    }

    private boolean isValid(TreeNode node, long max, long min) {
        if (node == null) {
            return true;
        }
        if (node.val >= max || node.val <= min) {
            return false;
        }
        return isValid(node.left, node.val, min) && isValid(node.right, max, node.val);
    }
}
