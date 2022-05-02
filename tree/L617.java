package tree;

/*
 * Amazon
 * LeetCode Difficulty: Easy
 * My Judgement: Medium
 */
public class L617 {

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 != null && root2 != null) {
            root1.val += root2.val;
            if (root1.left == null && root2.left != null) {
                root1.left = root2.left;
            } else {
                mergeTrees(root1.left, root2.left);
            }
            if (root1.right == null && root2.right != null) {
                root1.right = root2.right;
            } else {
                mergeTrees(root1.right, root2.right);
            }
        } else if (root1 == null && root2 != null) {
            root1 = root2;
        }

        return root1;
    }
}
