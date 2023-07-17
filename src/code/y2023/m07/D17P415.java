package code.y2023.m07;

public class D17P415 {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int len1 = num1.length();
        int len2 = num2.length();
        int add = 0;
        for (int i = 0; i < len1 || i < len2; i++) {
            char c1 = i < len1 ? num1.charAt(len1 - i - 1) : '0';
            char c2 = i < len2 ? num2.charAt(len2 - i - 1) : '0';
            int num = c1 - '0' + c2 - '0' + add;
            add = num / 10;
            sb.append(num % 10);
        }
        if (add == 1) {
            sb.append(1);
        }
        return sb.reverse().toString();
    }
}
