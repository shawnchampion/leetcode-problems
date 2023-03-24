package code.trie;

public class P208 {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("b");
        trie.insert("cd");
        System.out.println(trie.startsWith("bcd"));
    }
}
class Trie {
    private Trie[] children;
    private boolean isEnd;

    public Trie() {
        children = new Trie[26];
        isEnd = false;
    }

    public void insert(String word) {
        word = word.toLowerCase();
        Trie node = this;
        for (char letter: word.toCharArray()) {
            int number = letter - 'a';
            if (node.children[number] == null) {
                node.children[number] = new Trie();
            }
            node = node.children[number];
        }
        node.isEnd = true;
    }

    public boolean search(String word) {
        Trie node = searchPrefix(word);
        return node != null && node.isEnd;
    }

    public boolean startsWith(String prefix) {
        return searchPrefix(prefix) != null;
    }

    private Trie searchPrefix(String prefix) {
        prefix = prefix.toLowerCase();
        Trie node = this;
        for (char letter: prefix.toCharArray()) {
            int number = letter - 'a';
            if (node.children[number] == null) {
                return null;
            } else {
                node = node.children[number];
            }
        }
        return node;
    }
}
