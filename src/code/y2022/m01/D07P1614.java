package code.y2022.m01;

public class D07P1614 {
    public int maxDepth(String s) {
        int res = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                count++;
                res = Math.max(res, count);
            }
            if (s.charAt(i) == ')') {
                count--;
            }
        }
        return res;
    }
}
