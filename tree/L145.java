package tree;

import java.util.ArrayList;
import java.util.List;

/*
 * Basic Algorithm
 * LeetCode Difficulty: Easy
 * My Judgement: Easy
 */
public class L145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if (root == null) {
            return list;
        }
        list.addAll(postorderTraversal(root.left));
        list.addAll(postorderTraversal(root.right));
        list.add(root.val);
        return list;
    }
}
