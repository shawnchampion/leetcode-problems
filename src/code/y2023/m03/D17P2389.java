package code.y2023.m03;

import java.util.Arrays;

public class D17P2389 {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int[] sums = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            sums[i] = sum;
        }
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            result[i] = find(sums, queries[i]);
        }
        return result;
    }

    private int find(int[] sums, int num) {
        int i = 0, j = sums.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (sums[mid] > num) {
                j = mid - 1;
            } else if (sums[mid] < num) {
                i = mid + 1;
            } else {
                return mid + 1;
            }
        }
        return i;
    }
}
