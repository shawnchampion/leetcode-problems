package code.y2021.m12;

import java.util.HashMap;

public class P748 {
    private final int[] plateCount = new int[26];
    private final int[] wordCount = new int[26];

    public String shortestCompletingWord(String licensePlate, String[] words) {
        for (int i = 0; i < licensePlate.length(); i++) {
            char c = licensePlate.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c = (char)(c - 'A' + 'a');
            }
            if (c >= 'a' && c <= 'z') {
                plateCount[c - 'a']++;
            }
        }
        String ans = null;
        int min = -1;
        for (String word : words) {
            if (contains(word)) {
                if (ans == null || word.length() < min) {
                    ans = word;
                    min = word.length();
                }
            }
        }
        return ans;
    }

    private boolean contains(String word) {
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            wordCount[c - 'a']++;
        }
        boolean flag = true;
        for (int i = 0; i < 26; i++) {
            if (plateCount[i] > wordCount[i]) {
                flag = false;
            }
            wordCount[i] = 0;
        }
        return flag;
    }
}
