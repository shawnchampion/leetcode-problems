package code.history;

public class P1213 {
    public int[] arraysIntersection(int[][] arrays) {
        // 数组长度
        int[] arrayLen = new int[arrays.length];
        for (int i = 0; i < arrays.length; i++) {
            arrayLen[i] = arrays[i].length;
        }
        // 数组指针
        int[] arrayIndex = new int[arrays.length];
        while(true) {
            // 退出条件，当任意数组当指针超过当前数组的长度
            for (int i = 0; i < arrays.length; i++) {
                if (arrayIndex[i] >= arrayLen[i]) {
                    break;
                }
            }




        }
    }
}
