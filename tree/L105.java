package tree;

public class L105 {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode node = new TreeNode(preorder[0]);
        return generateTree(node, preorder, inorder);
    }

    private TreeNode generateTree(TreeNode node, int[] preorder, int[] inorder) {
        int lSize = 0, rSize, i = 0;
        while(inorder[i] != node.val) {
            i++;
        }
        lSize = i;
        rSize = inorder.length - i - 1;

        if (lSize >= 1) {
            TreeNode leftNode = new TreeNode(preorder[1]);
            node.left = leftNode;
            if (lSize > 1) {
                int[] lPreorder = new int[lSize];
                int[] lInorder = new int[lSize];
                for (i = 0; i < lSize; i++) {
                    lPreorder[i] = preorder[i + 1];
                    lInorder[i] = inorder[i];
                }
                generateTree(leftNode, lPreorder, lInorder);
            }
        }

        if (rSize >= 1) {
            TreeNode rightNode = new TreeNode(preorder[lSize + 1]);
            node.right = rightNode;
            if (rSize > 1) {
                int[] rPreorder = new int[rSize];
                int[] rInorder = new int[rSize];
                for (i = 0; i < rSize; i++) {
                    rPreorder[i] = preorder[lSize + 1 + i];
                    rInorder[i] = inorder[lSize + 1 + i];
                }
                generateTree(rightNode, rPreorder, rInorder);
            }
        }

        return node;
    }
}
