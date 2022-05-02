package tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/*
 * Company : Google, Amazon
 * LeetCode Difficulty: Medium
 * My Judgement: Medium
 */
public class L103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> levelList = new ArrayList<List<Integer>>();
        if (root != null) {
            LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
            queue.add(root);
            boolean fromLeft = true;
            while(!queue.isEmpty()) {
                int size = queue.size();
                List<Integer> level = new ArrayList<Integer>();
                for (int i = 0; i < size; i++) {
                    TreeNode node = queue.removeFirst();
                    level.add(node.val);
                    if (node.left != null) {
                        queue.add(node.left);
                    }
                    if (node.right != null) {
                        queue.add(node.right);
                    }

                }
                if (!fromLeft) {
                    Collections.reverse(level);
                }
                levelList.add(level);
                fromLeft = !fromLeft;
            }
        }
        return levelList;
    }

}
