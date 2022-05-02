package stack;

import java.util.Stack;

/*
 * Company : Facebook, Yahoo, Yelp
 * LeetCode Difficulty: Medium
 * My Judgement: Hard
 */
public class L394 {

    public String decodeString(String s) { // This approach is ok, need some minimum improvement
        Stack<Integer> numberStack = new Stack<Integer>();
        Stack<String> stringStack = new Stack<String>();
        String result = "";
        String digitString = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                digitString += c;
            } else if (c == '[') {
                numberStack.push(Integer.parseInt(digitString));
                digitString = "";
                stringStack.push(result);
                result = "";
            } else if (c == ']') {
                int digit = numberStack.pop();
                StringBuilder builder = new StringBuilder(stringStack.pop());
                for (int index = 0; index < digit; index++) {
                    builder.append(result);
                }
                result = builder.toString();
            } else {
                result += c;
            }
        }
        return result;
    }
}
