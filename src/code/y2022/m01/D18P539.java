package code.y2022.m01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class D18P539 {
    public int findMinDifference(List<String> timePoints) {
        List<Integer> minutes = new ArrayList<>();
        for (String timePoint : timePoints) {
            String[] tp = timePoint.split(":");
            int h = Integer.parseInt(tp[0]);
            int m = Integer.parseInt(tp[1]);
            minutes.add(h * 60 + m);
        }
        Collections.sort(minutes);
        int min = 24 * 60;
        for (int i = 0; i < minutes.size(); i++) {
            int minus;
            if (i == 0) {
                minus = minutes.get(minutes.size() - 1) - minutes.get(0);
            } else {
                minus = minutes.get(i) - minutes.get(i - 1);
            }
            min = Math.min(Math.min(minus, 24 * 60 - minus), min);
        }
        return min;
    }
}
