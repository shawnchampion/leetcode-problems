package code.y2023.m10;

public class D26P2520 {
    public int countDigits(int num) {
        char[] vals = String.valueOf(num).toCharArray();
        int count = 0;
        for (char val : vals) {
            int n = val - '0';
            if (n == 0) {
                continue;
            }
            if (num % n == 0) {
                count++;
            }
        }
        return count;
    }
}
