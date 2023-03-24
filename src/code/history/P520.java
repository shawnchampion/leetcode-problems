package code.history;

public class P520 {
    public static void main(String[] args) {
        System.out.println(detectCapitalUse("gG"));
    }

    public static boolean detectCapitalUse(String word) {

        return word.toUpperCase().equals(word) ||
                new StringBuilder(word).replace(0, 1, word.substring(0, 1).toLowerCase()).toString().equals(word.toLowerCase());
    }
}
