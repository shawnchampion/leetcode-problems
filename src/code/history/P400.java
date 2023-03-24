package code.history;

public class P400 {

    /**
     * 1-9 10-99 100-999 1000-9999
     * [1, 9]               1
     * [10, (99-9)*2+9]     2
     * [  , (999-99)*3
     * 1-9 10-（99-10）
     */
    private static long[] range = new long[10];
    private static int len = 0;

    static  {
        range[1] = 9;
        len = 1;
        while (range[len] < Integer.MAX_VALUE) {
            len++;
            range[len] = (long)Math.pow(10, len-1)*9*len+range[len-1];
        }
    }

    public int findNthDigit(int n) {
        if (n < 10) {
            return n;
        }
        for (int i = 1; i <= len; i++) {
            if (n <= range[i]) {
                int a = (int)((n - range[i-1] - 1)/i + Math.pow(10, i-1));
                int b = (int)(n - range[i-1] - 1)%i;
                String num = String.valueOf(a);
                return num.charAt(b) - '0';
            }
        }
        return 0;
    }

}
