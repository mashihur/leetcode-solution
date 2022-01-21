package tree

/*
 * Basic Algorithm
 * LeetCode Difficulty: Medium
 * My Judgement: Easy
 */
class L701 {
    fun insertIntoBST(root: TreeNode?, value: Int): TreeNode? {
        if (root == null) {
            return TreeNode(value)
        }
        generateBST(root, value)
        return root
    }

    fun generateBST(root: TreeNode, value: Int) {
        if (value > root.`val`) {
            if (root.right == null)
                root.right = TreeNode(value)
            else
                generateBST(root.right, value)
        } else {
            if (root.left == null)
                root.left = TreeNode(value)
            else
                generateBST(root.left, value)
        }
    }
}