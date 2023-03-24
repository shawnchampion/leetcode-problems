package code.history;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P349 {
//    public int[] intersection(int[] nums1, int[] nums2) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int num: nums1) {
//            map.put(num, 1);
//        }
//        for (int num: nums2) {
//            if (map.getOrDefault(num, 0) == 1) {
//                map.put(num, 2);
//            }
//        }
//        ArrayList<Integer> list = new ArrayList<>();
//        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
//            if (entry.getValue() == 2) {
//                list.add(entry.getKey());
//            }
//        }
//        return list.stream().mapToInt(Integer::intValue).toArray();
//    }

    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int len1 = nums1.length, len2 = nums2.length;

        int[] num = new int[Math.min(len1, len2)];

        int x1 = 0, x2 = 0;
        int x = -1;
        while (x1 < len1 && x2 < len2) {
            if (nums1[x1] == nums2[x2]) {
                num[++x] = nums1[x1];
                x1++;
                x2++;
            } else if (nums1[x1] < nums2[x2]) {
                x1++;
            } else if (nums1[x1] > nums2[x2]) {
                x2++;
            }
        }
        return Arrays.copyOfRange(num, 0, x + 1);
    }
}
