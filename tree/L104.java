package tree;

/*
 * Company : Google, Amazon, Apple, Yahoo, LinkedIn
 * LeetCode Difficulty: Easy
 * My Judgement: Easy
 */
public class L104 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
