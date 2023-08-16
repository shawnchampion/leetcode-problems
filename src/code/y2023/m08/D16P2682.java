package code.y2023.m08;

import java.util.ArrayList;
import java.util.List;

public class D16P2682 {
    public int[] circularGameLosers(int n, int k) {
        int[] status = new int[n + 1];
        status[1] = 1;
        int current = 1;
        int round = 1;
        do {
            current += round++ * k;
            if (current > n) {
                int mod = current % n;
                current = mod != 0 ? mod : n;
            }
            status[current]++;
        } while (status[current] != 2);
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < n + 1; i++) {
            if (status[i] == 0) {
                result.add(i);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
