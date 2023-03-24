package code.y2022.m09;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class D01P1475 {
    public int[] finalPrices(int[] prices) {
        Deque<Integer> stack = new ArrayDeque<>();
        int[] ans = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            while(!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
                int j = stack.pop();
                ans[j] = prices[j] - prices[i];
            }
            stack.push(i);
            ans[i] = prices[i];
        }
        return ans;
    }
}
