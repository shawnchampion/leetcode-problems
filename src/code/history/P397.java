package code.history;

import java.util.HashMap;

public class P397 {
//    HashMap<Integer, Integer> map = new HashMap<>();
//    public int integerReplacement(int n) {
//        if (n == 1) {
//            return 0;
//        }
//        if (map.containsKey(n)) {
//            return map.get(n);
//        }
//        int ans;
//        if ((n & 1) == 0) {
//            ans = 1 + integerReplacement(n / 2);
//        } else {
//            ans = 2 + Math.min(integerReplacement(n / 2), integerReplacement(n / 2 + 1));
//        }
//        map.put(n, ans);
//        return ans;
//    }

    public int integerReplacement(int n) {
        int count = 0;
        while (true) {
            if (n == 1) {
                break;
            }
            if (n == 3) {
                count += 2;
                break;
            }
            if ((n & 1) == 0) {
                n >>= 1;
                count += 1;
            } else if ((n & 3) == 1) {
                n >>= 1;
                count += 2;
            } else if ((n & 3) == 3) {
                n = n / 2 + 1;
                count += 2;
            }
        }
        return count;
    }
}
