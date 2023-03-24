package code.y2023.m03;

import java.util.HashMap;
import java.util.Map;

public class D10P1590 {
    public int minSubarray(int[] nums, int p) {
        int[] sums = new int[nums.length + 1];
        int x = 0;
        for (int i = 1; i < sums.length; i++) {
            x = (sums[i - 1] + nums[i - 1] % p) % p;
            sums[i] = x;
        }
        if (x == 0) {
            return 0;
        }
        int min = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i < sums.length; i++) {
            map.put(sums[i - 1], i - 1);
            int y = (sums[i] - x + p) % p;
            if (map.containsKey(y)) {
                min = Math.min(min, i - map.get(y));
            }
        }
        return min == nums.length ? -1 : min;
    }
}
