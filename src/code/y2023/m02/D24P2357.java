package code.y2023.m02;

import java.util.HashSet;
import java.util.Set;

public class D24P2357 {
    public int minimumOperations(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (num == 0) {
                continue;
            }
            set.add(num);
        }
        return set.size();
    }
}
