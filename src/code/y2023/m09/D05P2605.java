package code.y2023.m09;

public class D05P2605 {
    public int minNumber(int[] nums1, int[] nums2) {
        int[] nums = new int[10];
        int min1 = 10, min2 = 10;
        for (int num : nums1) {
            nums[num]++;
            min1 = Math.min(min1, num);
        }
        for (int num : nums2) {
            nums[num]++;
            min2 = Math.min(min2, num);
        }
        for (int i = 1; i < 10; i++) {
            if (nums[i] == 2) {
                return i;
            }
        }
        if (min1 < min2) {
            return min1 * 10 + min2;
        } else {
            return min2 * 10 + min1;
        }
    }
}
