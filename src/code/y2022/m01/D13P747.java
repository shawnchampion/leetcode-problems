package code.y2022.m01;

import java.util.Arrays;

public class D13P747 {
    public int dominantIndex(int[] nums) {
        int length = nums.length;
        if (length == 1) {
            return 0;
        }
        int[] sorted = Arrays.copyOf(nums, length);
        Arrays.sort(sorted);
        if (length > 1 && sorted[length-1] >= sorted[length-2] * 2) {
            for (int i = 0 ; i < length; i++) {
                if (nums[i] == sorted[length-1]) {
                    return i;
                }
            }
        }
        return -1;
    }
}
