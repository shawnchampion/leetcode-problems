package code.y2023.m07;

import java.util.Arrays;

public class D13P931 {
    public int minFallingPathSum(int[][] matrix) {
        int[] result = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            int[] pre = Arrays.copyOf(result, result.length);
            for (int j = 0; j < matrix.length; j++) {
                if (i == 0) {
                    result[j] = matrix[i][j];
                    continue;
                }
                int min = pre[j];
                if (j > 0) {
                    min = Math.min(min, pre[j-1]);
                }
                if (j < matrix.length - 1) {
                    min = Math.min(min, pre[j+1]);
                }
                result[j] = matrix[i][j] + min;
            }
//            System.out.println(Arrays.toString(result));
        }
        return Arrays.stream(result).min().orElse(0);
    }

    public static void main(String[] args) {
        System.out.println(new D13P931().minFallingPathSum(new int[][]{{2,1,3},{6,5,4},{7,8,9}}));
    }
}
