package code.y2023.m10;

import java.util.Arrays;

public class D09P2578 {
    public int splitNum(int num) {
        String numStr = Integer.toString(num);
        char[] numArr = numStr.toCharArray();
        Arrays.sort(numArr);
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < numArr.length; i++) {
            if ((i & 1) == 0) {
                sb1.append(numArr[i]);
            } else {
                sb2.append(numArr[i]);
            }
        }
        int num1 = Integer.parseInt(sb1.toString());
        int num2 = Integer.parseInt(sb2.toString());
        return num1 + num2;
    }
}
