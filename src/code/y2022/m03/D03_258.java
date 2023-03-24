package code.y2022.m03;

public class D03_258 {
    public int addDigits(int num) {
        while (num > 9) {
            int n = num;
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            num = sum;
        }
        return num;
    }
}
