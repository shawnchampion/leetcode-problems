package code.y2022.m10;

import java.util.Arrays;
import java.util.Collections;

public class D31P481 {
    int[] ans;
    public D31P481() {
        char[] magical = new char[100005];
        magical[1] = '1';
        magical[2] = '2';
        magical[3] = '2';
        char[] s = new char[2];
        s[0] = '2';
        s[1] = '1';
        ans = new int[100005];
        ans[1] = ans[2] = ans[3] = 1;
        int count = 1;

        for (int i = 3, j = 4; j < 100001; i++) {
            char m = s[magical[j-1] - '1'];
            if (magical[i] == '2') {
                magical[j] = magical[j+1] = m;
                if (m == '1') {
                    ans[j] = ++count;
                    ans[j + 1] = ++count;
                } else {
                    ans[j] = ans[j + 1] = count;
                }
                j += 2;
            } else {
                magical[j] = m;
                if (m == '1') {
                    ans[j] = ++count;
                } else {
                    ans[j] = count;
                }
                j += 1;
            }
        }
    }
    public int magicalString(int n) {
        return ans[n];
    }

    public static void main(String[] args) {
        D31P481 d = new D31P481();
        for (int i = 1; i < 11; i++) {
            System.out.println(d.magicalString(i));
        }
    }
}
