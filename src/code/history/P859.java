package code.history;

import java.util.HashSet;
import java.util.Set;

public class P859 {
    public static void main(String[] args) {
        System.out.println(new P859().buddyStrings("ab", "ba"));
    }
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        int x = -1, y = -1;
        int count = 0;
        for (int i = 0; i< s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                count++;
                if (x == -1) {
                    x = i;
                } else {
                    y = i;
                }
            }
        }
        System.out.println("x:" + x + ",y:" + y);
        if (count == 0) {
            Set<Character> set = new HashSet<>();
            for (char ch: s.toCharArray()) {
                set.add(ch);
            }
            return set.size() < s.length();
        } else if (count == 2) {
            char sX = s.charAt(x), sY = s.charAt(y);
            char gX = goal.charAt(x), gY = goal.charAt(y);
            return sX == gY && sY == gX;
        } else {
            return false;
        }
    }
}
