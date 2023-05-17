package code.y2023.m04;

public class D05P2427 {
    public int commonFactors(int a, int b) {
        int result = 0;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                result++;
            }
        }
        return result;
    }
}
