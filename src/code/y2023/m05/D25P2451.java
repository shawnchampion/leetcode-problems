package code.y2023.m05;

public class D25P2451 {
    public String oddString(String[] words) {
        int[] diff;
        if (compare(words[0], words[1])) {
            diff = getDiff(words[0]);
        } else {
            return compare(words[0], words[2]) ? words[1] : words[0];
        }
        for (int i = 2; i < words.length; i++) {
            if (!compare(diff, words[i])) {
                return words[i];
            }
        }
        return null;
    }

    boolean compare(String word1, String word2) {
        for (int i = 1; i < word1.length(); i++) {
            if (word1.charAt(i) - word1.charAt(i - 1) != word2.charAt(i) - word2.charAt(i - 1)) {
                return false;
            }
        }
        return true;
    }

    boolean compare(int[] diff, String word) {
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) - word.charAt(i - 1) != diff[i - 1]) {
                return false;
            }
        }
        return true;
    }

    int[] getDiff(String word) {
        int[] result = new int[word.length() - 1];
        for (int i = 1; i < word.length(); i++) {
            result[i - 1] = word.charAt(i) - word.charAt(i - 1);
        }
        return result;
    }
}
