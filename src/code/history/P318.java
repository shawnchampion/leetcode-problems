package code.history;

import java.util.Arrays;

public class P318 {

    public static void main(String[] args) {
    }

    public int maxProduct(String[] words) {
        int[] masks = new int[words.length];

        for (int j = 0; j < words.length; j++) {
            String word = words[j];
            for (int i = 0; i < word.length(); i++) {
                masks[j] |= 1 << (word.charAt(i) - 'a');
            }
        }

        int max = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if ((masks[i] & masks[j]) == 0) {
                    max = Math.max(words[i].length() * words[j].length(), max);
                }
            }
        }
        return max;
    }
}
