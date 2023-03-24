package code.history;

public class P14 {
    public static void main(String[] args) {
        String[] strs = new String[]{"ab", "a"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        // 选择第0行作为比较基准
        String base = strs[0];
        // result为相同长度，第i个字母，第j行字符串
        int result = 0, i, j;
        // 比较每一列字母是否相等
        for (i=0;i<base.length();i++) {
            // 当前比较第0行与第j行的第i个字母是否相等
            for (j=1;j< strs.length;j++) {
                // 若比较的字母位置已超过当前行的长度，结束比较
                if (i >= strs[j].length()) {
                    break;
                }
                // 若比较的字母不相等，结束比较
                if (strs[j].charAt(i) != base.charAt(i)) {
                    break;
                }
            }
            // 若比较没有进行到最后，则该列不完全相同，结束比较
            if (j != strs.length) {
                break;
            }
            // 若比较进行到最后，则该列完全相同，长度增加
            result++;
        }
        // 取相同部分作为最终结果
        return base.substring(0, result);
    }
}
