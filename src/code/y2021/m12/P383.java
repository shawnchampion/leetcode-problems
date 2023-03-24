package code.y2021.m12;

public class P383 {
    public boolean conConstruct(String ransomNote, String magazine) {
        int[] letters = new int[27];
        for (int i = 0; i < magazine.length(); i++) {
            letters[magazine.charAt(i)- 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            int index = ransomNote.charAt(i) - 'a';
            letters[index]--;
            if (letters[index] < 0) {
                return false;
            }
        }
        return true;
    }
}
