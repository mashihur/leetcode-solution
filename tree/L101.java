package tree;

/*
 * Company : Google, Amazon, Apple, Microsoft, LinkedIn
 * LeetCode Difficulty: Easy
 * My Judgement: Easy - similar L100
 */
public class L101 {
    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null) {
            return false;
        }
        return (node1.val == node2.val) && isSymmetric(node1.left, node2.right) && isSymmetric(node1.right, node2.left);

    }
}
