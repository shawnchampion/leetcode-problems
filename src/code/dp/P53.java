package code.dp;

public class P53 {
    public int maxSubArray(int[] nums) {
        int[] f = new int[nums.length];
        f[0] = nums[0];
        int pre = f[0];
        for (int i = 1; i < nums.length; i++) {
            f[i] = pre > 0 ? pre + nums[i] : nums[i];
            pre = f[i];
        }
        int max = f[0];
        for (int i = 1; i < nums.length; i++) {
            max = Math.max(max, f[i]);
        }
        return max;
    }
}
