package code.y2022.m10;

public class D11P1790 {
    public boolean areAlmostEqual(String s1, String s2) {
        int count = 0;
        int a = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
                if (count == 1) {
                    a = i;
                }
                if (count == 2 && (s1.charAt(a) != s2.charAt(i) || s1.charAt(i) != s2.charAt(a))) {
                    return false;
                }
            }
            if (count > 2) {
                return false;
            }
        }
        return count != 1;
    }
}
