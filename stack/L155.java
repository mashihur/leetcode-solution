package stack;

import java.util.*;

/*
 * LeetCode Difficulty: Easy
 * My Judgement: Medium - Cannot use List, it will increase time-complexity
 */
public class L155 {
    Stack<Integer> stack;
    PriorityQueue<Integer> queue;

    public L155() {
        stack = new Stack<>();
        queue = new PriorityQueue<>();
    }

    public void push(int val) {
        stack.push(val);
        queue.add(val); // add() -> O(log n) in PriorityQueue but O(n) in ArrayList when position is sent
    }

    public void pop() {
        queue.remove(stack.pop()); // remove() -> O(log n) in PriorityQueue but O(n) in ArrayList
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return queue.peek();
    }
}
