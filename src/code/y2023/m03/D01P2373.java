package code.y2023.m03;

public class D01P2373 {
    public int[][] largestLocal(int[][] grid) {
        int range = 3;
        int[][] result = new int[grid.length - range + 1][grid.length - range + 1];
        int[][][] resultLoc = new int[grid.length - range + 1][grid.length - range + 1][2];
        for (int i = 0; i < grid.length - range + 1; i++) {
            for (int j = 0; j < grid.length - range + 1; j++) {
                resultLoc[i][j] = findMax(grid, resultLoc, i, j, range);
                result[i][j] = grid[resultLoc[i][j][0]][resultLoc[i][j][1]];
            }
        }
        return result;
    }

    private int[] findMax(int[][] grid, int[][][] resultLoc, int x, int y, int range) {
        int[] maxLoc = new int[]{x, y};
        int rangeX = x + range;
        int rangeY = y + range;
        if (x > 0 && resultLoc[x - 1][y][0] >= x) {
            maxLoc[0] = resultLoc[x - 1][y][0];
            maxLoc[1] = resultLoc[x - 1][y][1];
            x = x + range - 1;
        } else if (y > 0 && resultLoc[x][y - 1][1] >= y) {
            maxLoc[0] = resultLoc[x][y - 1][0];
            maxLoc[1] = resultLoc[x][y - 1][1];
            y = y + range - 1;
        }
        for (int i = x; i < rangeX; i++) {
            for (int j = y; j < rangeY; j++) {
                if (grid[i][j] >= grid[maxLoc[0]][maxLoc[1]]) {
                    maxLoc[0] = i;
                    maxLoc[1] = j;
                }
            }
        }
        return maxLoc;
    }
}
