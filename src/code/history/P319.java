package code.history;

public class P319 {
    private static final int MAX = 31623;
    private static int[] arr = new int[MAX];

    static {
        for (int i = 0; i < 1001; i++) {
            arr[i] = i * i;
        }
    }

    public static void main(String[] args) {
        System.out.println(bulbSwitch(0));
    }

    public static int bulbSwitch(int n) {
        for (int i = 0; i < MAX; i++) {
            if (n == arr[i]) {
                return i;
            }
            if (n < arr[i]) {
                return i - 1;
            }
        }
        return MAX - 1;
    }
}
