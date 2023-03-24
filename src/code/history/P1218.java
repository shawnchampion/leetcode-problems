package code.history;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class P1218 {
    public static void main(String[] args) {

    }

    public static int longestSubsequence(int[] arr, int difference) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num: arr) {
            if (map.containsKey(num - difference)) {
                map.put(num, map.get(num - difference) + 1);
            } else {
                map.put(num, 1);
            }
        }
        return Collections.max(map.values());
    }
}
