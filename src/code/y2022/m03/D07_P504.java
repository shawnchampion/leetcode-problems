package code.y2022.m03;

import com.sun.tools.javac.util.StringUtils;

public class D07_P504 {
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        boolean flag = num < 0;
        num = Math.abs(num);
        while (num > 0) {
            sb.append(num % 7);
            num /= 7;
        }
        if (flag) {
            sb.append("-");
        }
        return sb.reverse().toString();
    }
}
