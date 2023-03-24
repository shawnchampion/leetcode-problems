package code.y2022.m10;

public class D27P1822 {
    public int arraySign(int[] nums) {
        int countNegative = 0;
        for (int num : nums) {
            if (num == 0) {
                return 0;
            } else if (num < 0) {
                countNegative++;
            }
        }
        if ((countNegative & 1) == 0) {
            return 1;
        } else {
            return -1;
        }
    }
}
