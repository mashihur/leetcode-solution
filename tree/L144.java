package tree;

import java.util.ArrayList;
import java.util.List;

/*
 * Basic Algorithm
 * LeetCode Difficulty: Easy
 * My Judgement: Easy
 */
public class L144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if (root == null) {
            return list;
        }
        list.add(root.val);
        list.addAll(preorderTraversal(root.left));
        list.addAll(preorderTraversal(root.right));
        return list;
    }
}
