package recursion;

import java.util.ArrayList;
import java.util.List;

/*
 * Company: Google, Uber
 * LeetCode Difficulty: Medium
 * My Judgement: Medium
 */
public class L22 {
    public List<String> generateParenthesis(int n) {
        return generateParenthesis(n, new ArrayList<String>(), "", 0, 0);
    }

    public List<String> generateParenthesis(int n, List<String> list, String parenthesis, int left, int right) {
        if (parenthesis.length() == 2 * n) {
            list.add(parenthesis);
        } else {
            if (left < n) {
                generateParenthesis(n, list, parenthesis + "(", left + 1, right);
            }
            if (right < left) {
                generateParenthesis(n, list, parenthesis + ")", left, right + 1);
            }
        }

        return list;
    }
}
