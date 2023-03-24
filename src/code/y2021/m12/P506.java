package code.y2021.m12;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P506 {
    public String[] findRelativeRanks(int[] score) {
        int[] sort = Arrays.copyOf(score, score.length);
        Arrays.sort(sort);
        for (int i = 0; i < sort.length / 2; i++) {
            int temp = sort[i];
            sort[i] = sort[sort.length - i - 1];
            sort[sort.length - i - 1] = temp;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < sort.length; i++) {
            map.put(sort[i], i + 1);
        }
        String[] ans = new String[score.length];
        for (int i = 0; i < score.length; i++) {
            if (map.get(score[i]) == 1) {
                ans[i] = "Gold Medal";
            } else if (map.get(score[i]) == 2) {
                ans[i] = "Silver Medal";
            } else if (map.get(score[i]) == 3) {
                ans[i] = "Bronze Medal";
            } else {
                ans[i] = String.valueOf(map.get(score[i]));
            }
        }
        return ans;
    }
}
