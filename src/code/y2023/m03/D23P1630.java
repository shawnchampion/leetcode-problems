package code.y2023.m03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class D23P1630 {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        int[] sums = new int[nums.length + 1];
        for (int i = 1; i < nums.length + 1; i++) {
            sums[i] = sums[i - 1] + nums[i - 1];
        }
        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < l.length; i++) {
            int[] temp = Arrays.copyOfRange(nums, l[i], r[i] + 1);
            Arrays.sort(temp);
            int sum = sums[r[i] + 1] - sums[l[i]];
            if (sum * 2 != (temp[0] + temp[temp.length - 1]) * (r[i] + 1 - l[i])) {
                result.add(Boolean.FALSE);
                continue;
            }
            boolean flag = Boolean.TRUE;
            for (int j = 1; j < temp.length - 1; j++) {
                if (temp[j + 1] - temp[j] != temp[j] - temp[j - 1]) {
                    flag = Boolean.FALSE;
                    break;
                }
            }
            result.add(flag);
        }
        return result;
    }

    public static void main(String[] args) {
        new D23P1630().checkArithmeticSubarrays(new int[]{-3,-6,-8,-4,-2,-8,-6,0,0,0,0}, new int[]{5,4,3,2,4,7,6,1,7}, new int[]{6,5,6,3,7,10,7,4,10});
    }
}
