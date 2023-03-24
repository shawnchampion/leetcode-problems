package code.y2022.m11;

public class D01P1662 {
    class Node {
        String[] word;
        int i;
        int j;

        Node(String[] word) {
            this.word = word;
            i = j = 0;
        }

        char getChar() {
            if (j == word[i].length()) {
                i += 1;
                j = 0;
            }
            if (i == word.length) {
                return 0;
            }
            return word[i].charAt(j++);
        }
    }

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        Node node1 = new Node(word1);
        Node node2 = new Node(word2);

        while(true) {
            char m = node1.getChar();
            char n = node2.getChar();
            if (m != n) {
                return false;
            }
            if (m == 0) {
                return true;
            }
        }
    }
}
