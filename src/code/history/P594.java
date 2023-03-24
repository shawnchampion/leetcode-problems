package code.history;

import java.util.HashMap;
import java.util.Map;

public class P594 {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int max = 0;
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if (map.containsKey(entry.getKey() + 1)) {
                max = Math.max(max, entry.getValue() + map.get(entry.getKey() + 1));
            }
        }
        return max;
    }
}
