package code.y2022.m10;

import java.util.*;

public class D17P904 {
    public int totalFruit(int[] fruits) {
        return totalFruit(fruits, 2);
    }

    public int totalFruit(int[] fruits, int n) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0, j = 0; i < fruits.length; i++) {
            map.put(fruits[i], map.getOrDefault(fruits[i], 0) + 1);
            while (map.size() > n) {
                map.computeIfPresent(fruits[j], (k, v) -> v - 1);
                if (map.get(fruits[j]) == 0) {
                    map.remove(fruits[j]);
                }
                j++;
            }
            max = Math.max(max, i + 1 - j);
        }
        return max;
    }
}
