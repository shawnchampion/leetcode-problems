package code.history;

public class P598 {
    public static void main(String[] args) {

    }

    public static int maxCount(int m, int n, int[][] ops) {
        if (ops.length == 0) {
            return m * n;
        }
        int minx = ops[0][0], miny = ops[0][1];
        for (int i = 1; i < ops.length; i++) {
            minx = Math.min(minx, ops[i][0]);
            miny = Math.min(miny, ops[i][1]);
        }
        return minx * miny;
    }
}
