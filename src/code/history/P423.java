package code.history;

import java.util.Arrays;
import java.util.stream.Collectors;

public class P423 {
    private static String[] words = new String[]{
            "zero", "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine"
    };

//    u [4]
//    w [2]
//    x [6]
//    z [0]
//    g [8]
// 0 2 4 6 8
//    h [3, 8]
//    s [6, 7]
//    f [4, 5]
// 3 5 7
//    i [5, 6, 8, 9]
//    o [0, 1, 2, 4]
    public String originalDigits(String s) {
        int[] nums = new int[10];
        int[] letters = new int[26];
        for (char c : s.toCharArray()) {
            letters[c - 'a']++;
        }
        nums[0] = letters['z' - 'a'];
        nums[2] = letters['w' - 'a'];
        nums[4] = letters['u' - 'a'];
        nums[6] = letters['x' - 'a'];
        nums[8] = letters['g' - 'a'];
        nums[5] = letters['f' - 'a'] - nums[4];
        nums[3] = letters['h' - 'a'] - nums[8];
        nums[7] = letters['s' - 'a'] - nums[6];
        nums[9] = letters['i' - 'a'] - nums[5] - nums[6] - nums[8];
        nums[1] = letters['o' - 'a'] - nums[0] - nums[2] - nums[4];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < nums[i]; j++) {
                sb.append(i);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int[][] letters = new int[26][26];
        int[] count = new int[26];
        for (int i = 0; i < words.length; i++) {
            for (char c : words[i].toCharArray()) {
                letters[c - 'a'][count[c - 'a']++] = i;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                System.out.println((char) (i + 'a') + " " +
                        Arrays.stream(Arrays.copyOfRange(letters[i], 0, count[i]))
                                .boxed().collect(Collectors.toSet())
                );
            }
        }
    }
}
