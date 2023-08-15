package code.y2023.m08;

public class D15P833 {
    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        String[] array = new String[s.length()];
        for (int i = 0; i < s.length(); i++) {
            array[i] = String.valueOf(s.charAt(i));
        }
        for (int i = 0; i < indices.length; i++) {
            int begin = indices[i];
            int len = sources[i].length();
            if (begin + len <= s.length() && sources[i].equals(s.substring(begin, begin + len))) {
                array[begin] = targets[i];
                for (int j = begin + 1; j < begin + len; j++) {
                    array[j] = null;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String str : array) {
            if (str != null) {
                sb.append(str);
            }
        }
        return sb.toString();
    }
}
