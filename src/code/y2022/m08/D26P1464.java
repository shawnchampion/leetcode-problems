package code.y2022.m08;

public class D26P1464 {
    public int maxProduct(int[] nums) {
        int m1 = Math.max(nums[0], nums[1]);
        int m2 = Math.min(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] >= m1) {
                m2 = m1;
                m1 = nums[i];
            } else if (nums[i] >= m2) {
                m2 = nums[i];
            }
        }
        return (m1 - 1) * (m2 - 1);
    }
}
