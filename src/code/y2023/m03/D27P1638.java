package code.y2023.m03;

public class D27P1638 {
    public int countSubstrings(String s, String t) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < t.length(); j++) {
                int diff = 0;
                for (int k = 0; i + k < s.length() && j + k < t.length(); k++) {
                    if (s.charAt(i + k) == t.charAt(j + k)) {
                        if (diff == 1) {
                            result++;
                        }
                    } else {
                        if (diff == 0) {
                            diff = 1;
                            result++;
                        } else {
                            break;
                        }
                    }
                }
            }
        }
        return result;
    }
}
