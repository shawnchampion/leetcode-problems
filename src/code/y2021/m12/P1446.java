package code.y2021.m12;

public class P1446 {
    public static void main(String[] args) {

    }

    public int maxPower(String s) {
        int ans = 1;
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
                ans = Math.max(ans, count);
            } else {
                count = 1;
            }
        }
        return ans;
    }
}
