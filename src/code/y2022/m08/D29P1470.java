package code.y2022.m08;

public class D29P1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length / 2) {
                ans[2 * i] = nums[i];
            } else {
                ans[2 * i - nums.length + 1] = nums[i];
            }
        }
        return ans;
    }
}
