package stack;

import java.util.HashMap;
import java.util.Stack;

/*
 * Company : Twitter, Airbnb, Amazon, Facebook, Microsoft, Bloomberg, Uber, Google
 * LeetCode Difficulty: easy
 * My Judgement: easy
 */
public class L20 {
    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (map.containsKey(temp)) {
                stack.push(temp);
            } else if (!stack.empty() && temp == map.get(stack.peek())) {
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.empty();
    }

}
