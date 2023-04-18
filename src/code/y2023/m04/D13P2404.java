package code.y2023.m04;

import java.util.HashMap;
import java.util.Map;

public class D13P2404 {
    public int mostFrequentEven(int[] nums) {
        int number = Integer.MAX_VALUE;
        int max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if ((num & 1) != 1) {
                map.merge(num, 1, Integer::sum);
                int v = map.get(num);
                if (v > max || (v == max && num < number)) {
                    max = v;
                    number = num;
                }
            }
        }
        return number == Integer.MAX_VALUE ? -1 : number;
    }
}
