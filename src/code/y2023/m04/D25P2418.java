package code.y2023.m04;

import java.util.TreeMap;

public class D25P2418 {
    public String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer, String> map = new TreeMap<>((o1, o2) -> o2 - o1);
        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }
        return map.values().toArray(new String[names.length]);
    }
}
