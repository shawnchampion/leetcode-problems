package code.y2022.m03;

import java.util.*;

public class D17_P720 {
    public static void main(String[] args) {
        String[] words = new String[]{"rac","rs","ra","on","r","otif","o","onpdu","rsf","rs","ot","oti","racy","onpd"};
        new D17_P720().longestWord(words);
    }

    public String longestWord(String[] words) {
        String result = "";
        Arrays.sort(words, (a, b) -> {
            if (a.length() != b.length()){
                return a.length() - b.length();
            } else {
                return a.compareTo(b);
            }
        });
        Set<String> wordSet = new HashSet<>();
        wordSet.add("");
        for (String word : words) {
            if (wordSet.contains(word.substring(0, word.length() - 1))) {
                wordSet.add(word);
                if (word.length() > result.length()) {
                    result = word;
                }
            }
        }
        return result;
    }
}
