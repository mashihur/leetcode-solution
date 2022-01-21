package tree

/*
 * Basic Algorithm
 * LeetCode Difficulty: Easy
 * My Judgement: Easy
 */
class L700 {

    fun searchBST(root: TreeNode?, `val`: Int): TreeNode? {
        if (root == null)
            return null
        if (root.`val` == `val`) {
            return root
        } else if (`val` > root.`val`) {
            return searchBST(root.right, `val`)
        } else {
            return searchBST(root.left, `val`)
        }
    }
}