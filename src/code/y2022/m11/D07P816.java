package code.y2022.m11;

import java.util.ArrayList;
import java.util.List;

public class D07P816 {
    public List<String> ambiguousCoordinates(String s) {
        List<String> res = new ArrayList<>();
        char[] c = s.toCharArray();
        for (int i = 2; i < s.length() - 1; i++) {
            List<String> l = cal(c, 0, i);
            List<String> r = cal(c, i, s.length());

            for (String ls : l) {
                for (String rs : r) {
                    res.add("(" + ls + ", " + rs + ")");
                }
            }
//            System.out.println(l);
//            System.out.println("------------------");
//            System.out.println(r);
//            System.out.println("==================");
        }
        return res;
    }

    public List<String> cal(char[] c, int l, int r) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < r - l; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(c, l, i + 1);
            if (i < r - l - 1) {
                sb.append('.');
                sb.append(c, l + i + 1, r - l - i - 1);
            }
            if (isValid(sb.toString())) {
                res.add(sb.toString());
            }
        }
        return res;
    }

    public boolean isValid(String s) {
        if (s.length() == 1) {
            return true;
        }
        if (s.charAt(0) == '0' && s.charAt(1) != '.') {
            return false;
        }
        if (s.charAt(s.length() - 1) == '0' && s.contains(".")) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new D07P816().ambiguousCoordinates("123"));
    }
}
