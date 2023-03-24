package code.y2022.m11;

public class D03P1668 {
    public int maxRepeating(String sequence, String word) {
        int count = 0;
        StringBuilder sb = new StringBuilder(word);
        while (sequence.contains(sb)) {
            sb.append(word);
            count++;
        }
        return count;
    }
}
