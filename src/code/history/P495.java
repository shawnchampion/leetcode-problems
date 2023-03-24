package code.history;

public class P495 {
    public static void main(String[] args) {

    }

    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        int sum = duration;
        int expired = timeSeries[0] + duration;
        for (int i = 1; i < timeSeries.length; i++) {
            if (expired < timeSeries[i]) {
                sum += duration;
            } else {
                sum += timeSeries[i] + duration - expired;
            }
            expired = timeSeries[i] + duration;
        }
        return sum;
    }
}
