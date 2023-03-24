package code.y2022.m02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class D15_P1380 {

    public List<Integer> luckyNumbers (int[][] matrix) {
        int resX = 0, resY = -1;
        for (int i = 0; i < matrix.length; i++) {
            int y = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < matrix[i][y]) {
                    y = j;
                }
            }
            if (resY == -1) {
                resY = y;
            }
            if (matrix[i][y] > matrix[resX][resY]) {
                resX = i;
                resY = y;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][resY] > matrix[resX][resY]) {
                return new ArrayList<>(0);
            }
        }
        return Collections.singletonList(matrix[resX][resY]);
    }

//    public List<Integer> luckyNumbers(int[][] matrix) {
//        int[] resX = new int[matrix.length];
//        int[] resY = new int[matrix[0].length];
//
//        for (int i = 0; i < matrix.length; i++) {
//            int res = 0;
//            for (int j = 1; j < matrix[i].length; j++) {
//                if (matrix[i][j] < matrix[i][res]) {
//                    res = j;
//                }
//            }
//            resX[i] = res;
//        }
//
//        for (int i = 0; i < matrix[0].length; i++) {
//            int res = 0;
//            for (int j = 1; j < matrix.length; j++) {
//                if (matrix[j][i] > matrix[res][i]) {
//                    res = j;
//                }
//            }
//            resY[i] = res;
//        }
//
//        List<Integer> res = new ArrayList<>();
//        for (int i = 0; i < matrix.length; i++) {
//            if (i == resY[resX[i]]) {
//                res.add(matrix[i][resX[i]]);
//            }
//        }
//        return res;
//    }
}
