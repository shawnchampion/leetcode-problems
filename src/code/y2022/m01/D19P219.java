package code.y2022.m01;

import java.util.Arrays;
import java.util.Comparator;

public class D19P219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] == nums[j] && j - i <= k) {
//                    return true;
//                }
//            }
//        }
//        return false;

        int[][] posNums = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            posNums[i][0] = nums[i];
            posNums[i][1] = i;
        }
        Comparator<int[]> comparator = Comparator.comparingInt(a -> a[0]);
        Arrays.sort(posNums, comparator.thenComparingInt(a -> a[1]));
        for (int i = 1;i < posNums.length;i++) {
            if (posNums[i][0] == posNums[i-1][0] && posNums[i][1] - posNums[i-1][1] <= k) {
                return true;
            }
        }
        return false;
    }
}
