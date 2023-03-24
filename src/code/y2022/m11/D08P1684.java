package code.y2022.m11;

import java.util.Arrays;

public class D08P1684 {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] c = new boolean[26];
        Arrays.fill(c, false);
        for (int i = 0; i < allowed.length(); i++) {
            c[allowed.charAt(i) - 'a'] = true;
        }
        int n = words.length;
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                if (!c[word.charAt(i) - 'a']) {
                    n--;
                    break;
                }
            }
        }
        return n;
    }
}
