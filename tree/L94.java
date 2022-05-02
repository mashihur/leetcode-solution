package tree;

import java.util.ArrayList;
import java.util.List;

/*
 * Basic Algorithm
 * LeetCode Difficulty: Easy
 * My Judgement: Easy
 */
public class L94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if (root == null) {
            return list;
        }
        list.addAll(inorderTraversal(root.left));
        list.add(root.val);
        list.addAll(inorderTraversal(root.right));
        return list;
    }
}
