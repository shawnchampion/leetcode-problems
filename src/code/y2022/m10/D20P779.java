package code.y2022.m10;

public class D20P779 {
    public int kthGrammar(int n, int k) {
        if (n == 1 && k == 1) {
            return 0;
        }
        int pre = kthGrammar(n - 1, (k + 1) / 2);
        if ((pre == 0 && (k & 1) == 1) || (pre == 1 && (k & 1) == 0)) {
            return 0;
        } else {
            return 1;
        }
    }
}
