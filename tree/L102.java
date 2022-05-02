package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * Suggested interview question
 * LeetCode Difficulty: Medium
 * My Judgement: Medium
 */
public class L102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levelList = new ArrayList<List<Integer>>();
        if (root != null) {
            LinkedList<TreeNode> nodeList = new LinkedList<TreeNode>();
            nodeList.add(root);
            while(!nodeList.isEmpty()) {
                int size = nodeList.size();
                ArrayList<Integer> newLevel = new ArrayList<Integer>();
                for (int i = 0; i < size; i++) {
                    TreeNode first = nodeList.removeFirst();
                    newLevel.add(first.val);
                    if (first.left != null) {
                        nodeList.add(first.left);
                    }
                    if (first.right != null) {
                        nodeList.add(first.right);
                    }
                }
                levelList.add(newLevel);
            }
        }
        return levelList;
    }
}
