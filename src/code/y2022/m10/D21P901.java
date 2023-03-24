package code.y2022.m10;

import java.util.*;

public class D21P901 {
    class StockSpanner {
        Deque<int[]> stack;
        int count;
        public StockSpanner() {
            stack = new ArrayDeque<>();
            count = 0;
            stack.push(new int[]{100001, -1});
        }

        public int next(int price) {
            while (stack.peek()[0] <= price) {
                stack.pop();
            }
            int result = count - stack.peek()[1];
            stack.push(new int[]{price, count++});
            return result;
        }
    }

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
}
