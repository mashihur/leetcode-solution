package tree;

/*
 * Company : Microsoft
 * LeetCode Difficulty: Easy
 * My Judgement: Easy
 * Best Solution
 */
public class L112 {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return checkPathSum(0, targetSum, root);
    }

    private boolean checkPathSum(int currentSum, int targetSum, TreeNode node) {
        if (node == null) {
            return false;
        }
        int sum = currentSum + node.val;
        if (node.left == null && node.right == null) {
            if (sum == targetSum) {
                return true;
            } else {
                return false;
            }
        }

        return checkPathSum(sum, targetSum, node.left) | checkPathSum(sum, targetSum, node.right);
    }
}
