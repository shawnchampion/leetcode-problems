package code.history;

public class P367 {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(14));
    }

    public static boolean isPerfectSquare(int num) {
        long i = 1;
        while (true) {
            if (i * i < num) {
                i++;
                continue;
            }
            if (i * i == num) {
                return true;
            }
            if (i * i > num) {
                return false;
            }
        }
    }
}
