package code.y2023.m04;

public class D21P2413 {
    public int smallestEvenMultiple(int n) {
        if ((n & 1) == 1) {
            return n * 2;
        } else {
            return n;
        }
    }
}
