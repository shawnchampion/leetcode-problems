package code.y2023.m03;

import java.util.*;

public class D24P1032 {
    TrieNode root;
    List<Character> letters;

    // 将结尾标识倒序构造字典树
    public D24P1032(String[] words) {
        root = new TrieNode();
        for(String word : words) {
            TrieNode node = root;
            for (int i = word.length() - 1; i >=0; i--) {
                char letter = word.charAt(i);
                node.children.putIfAbsent(letter, new TrieNode());
                node = node.children.get(letter);
            }
            node.isEndOfWord = true;
        }
        letters = new ArrayList<>();
    }

    // 倒序匹配结尾字符
    public boolean query(char letter) {
        letters.add(letter);
        TrieNode node = root;
        for (int i = letters.size() - 1; i >=0; i--) {
            char c = letters.get(i);
            node = node.children.get(c);
            if (node == null) {
                return false;
            }
            if (node.isEndOfWord) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        new D24P1032(new String[]{"cd", "f", "kl"});
    }

    static class TrieNode {
        boolean isEndOfWord;
        Map<Character, TrieNode> children;

        TrieNode() {
            isEndOfWord = false;
            children = new HashMap<>();
        }
    }
}
