package code.y2022.m02;

public class D23_P917 {
    public String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();
        int i = 0, j = s.length() - 1;
        while (i < j) {
            while (isNotChar(s.charAt(i))) {
                i++;
                if (i >= j) {
                    break;
                }
            }
            while (isNotChar(s.charAt(j))) {
                j--;
                if (i >= j) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        return new String(chars);
    }

    boolean isNotChar(char c) {
        return c < 'A' || c > 'Z' && c < 'a' || c > 'z';
    }
}
