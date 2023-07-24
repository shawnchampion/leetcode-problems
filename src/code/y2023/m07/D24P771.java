package code.y2023.m07;

public class D24P771 {
    public int numJewelsInStones(String jewels, String stones) {
        int range = 'z' - 'A' + 1;
        boolean[] isJewel = new boolean[range];
        for (int i = 0; i < jewels.length(); i++) {
            isJewel[jewels.charAt(i) - 'A'] = true;
        }
        int result = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (isJewel[stones.charAt(i) - 'A']) {
                result++;
            }
        }
        return result;
    }
}
