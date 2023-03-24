package code.y2022.m09;

public class D29 {
    public boolean isFlipedString(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        if (s1.equals("") && s2.equals("")) {
            return true;
        }
        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) != s1.charAt(0)) {
                continue;
            }
            int index1 = 0, index2 = i;
            while(index1 < s1.length() && s1.charAt(index1) == s2.charAt(index2)) {
                index1++;
                index2++;
                if (index2 == s2.length()) {
                    index2 = 0;
                }
            }
            if (index1 == s1.length()) {
                return true;
            }
        }
        return false;
    }
}
