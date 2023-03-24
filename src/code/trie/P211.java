package code.trie;

public class P211 {
    public static void main(String[] args) {
        WordDictionary wordDictionary = new WordDictionary();
        wordDictionary.addWord("bad");
        wordDictionary.addWord("dad");
        wordDictionary.addWord("mad");
        System.out.println(wordDictionary.search("pad")); // 返回 False
        System.out.println(wordDictionary.search("bad")); // 返回 True
        System.out.println(wordDictionary.search(".ad")); // 返回 True
        System.out.println(wordDictionary.search("b..")); // 返回 True
    }
}

class WordDictionary {
    WordDictionary[] children;
    boolean isEnd;

    public WordDictionary() {
        children = new WordDictionary[26];
        isEnd = false;
    }

    public void addWord(String word) {
        word = word.toLowerCase();
        WordDictionary node = this;
        for (char letter: word.toCharArray()) {
            int number = letter - 'a';
            if (node.children[number] == null) {
                node.children[number] = new WordDictionary();
            }
            node = node.children[number];
        }
        node.isEnd = true;
    }

    public boolean search(String word) {
        return searchNode(this, word.toLowerCase(), 0);
    }

    public boolean searchNode(WordDictionary node, String word, int index) {
        if (index == word.length()) {
            return node.isEnd;
        }
        char letter = word.charAt(index);
        if (letter == '.') {
            for (int i = 0; i < 26; i++) {
                if (node.children[i] != null && searchNode(node.children[i], word, index + 1)) {
                    return true;
                }
            }
            return false;
        } else {
            int number = letter - 'a';
            return (node.children[number] != null && searchNode(node.children[number], word, index + 1));
        }
//        for (int i = 0; i < word.length(); i++) {
//            char letter = word.charAt(i);
//            if (letter == '.') {
//                for (int j = 0; j < 26; j++) {
//                    if (node.children[j] == null) {
//                        continue;
//                    }
//                    if (searchNode(node.children[j], word.substring(i + 1))) {
//                        return true;
//                    }
//                }
//                return false;
//            } else {
//                int number = letter - 'a';
//                if (node.children[number] == null) {
//                    return false;
//                }
//                node = node.children[number];
//            }
//        }
//        return node.isEnd;
    }
}
