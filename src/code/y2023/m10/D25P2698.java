package code.y2023.m10;

import java.util.Arrays;

public class D25P2698 {
    private final int[] sum = new int[1001];

    public D25P2698() {
        for (int i = 1; i < 1001; i++) {
            sum[i] = isSpecial(i) ? sum[i - 1] + i * i : sum[i - 1];
        }
    }

    private boolean isSpecial(int i) {
        return check(i * i, i);
    }

    private boolean check(int num, int target) {
        if (num == target) {
            return true;
        }
        for (int x = 10; num / x > 0; x *= 10) {
            if (check(num / x, target - num % x)) {
                return true;
            }
        }
        return false;
    }

    public int punishmentNumber(int n) {
        return sum[n];
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new D25P2698().sum));
    }
}
