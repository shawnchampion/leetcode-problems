package code.y2022.m08;

import java.util.Stack;

public class D31P946 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int j = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < pushed.length; i++) {
            stack.push(pushed[i]);
            while (!stack.isEmpty() && j < popped.length && stack.peek().equals(popped[j])) {
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }
}
