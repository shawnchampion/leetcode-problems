package code.y2023.m08;

public class D11P1572 {
    public int diagonalSum(int[][] mat) {
        int len = mat.length;
        int result = 0;
        for (int i = 0; i < len; i++) {
            result += mat[i][i] + mat[len-i-1][i];
        }
        if (len % 2 == 1) {
            result -= mat[len/2][len/2];
        }
        return result;
    }
}
