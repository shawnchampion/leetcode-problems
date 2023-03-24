package code.y2022.m07;

public class P1217 {
    public int minCostToMoveChips(int[] position) {
        int a = 0;
        for (int pos: position) {
            if ((pos & 1) == 0) {
                a++;
            }
        }
        return Math.min(a, position.length - a);
    }
}