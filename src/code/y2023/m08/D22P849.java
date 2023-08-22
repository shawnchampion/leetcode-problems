package code.y2023.m08;

public class D22P849 {
    public int maxDistToClosest(int[] seats) {
        int dis = 0;
        int pre = -1;
        int first = -1;
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 0) {
                continue;
            }
            if (pre == -1) {
                pre = i;
                first = i;
                continue;
            }
            dis = Math.max(dis, i - pre);
            pre = i;
        }

        int result = dis / 2;
        result = Math.max(result, first);
        result = Math.max(result, seats.length - 1 - pre);
        return result;
    }
}
