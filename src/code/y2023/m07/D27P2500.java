package code.y2023.m07;

import java.util.Arrays;

public class D27P2500 {
    public int deleteGreatestValue(int[][] grid) {
        for (int[] row : grid) {
            Arrays.sort(row);
        }
        int result = 0;
        for (int i = 0; i < grid[0].length; i++) {
            int max = grid[0][i];
            for (int j = 1; j < grid.length; j++) {
                max = Math.max(max, grid[j][i]);
            }
            result += max;
        }
        return result;
    }
}
