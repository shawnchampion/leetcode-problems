package code.y2022.m08;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class D25P658 {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        if (x <= arr[0]) {
            return Arrays.stream(Arrays.copyOfRange(arr, 0, k)).boxed().collect(Collectors.toList());
        }
        if (x >= arr[arr.length - 1]) {
            return Arrays.stream(Arrays.copyOfRange(arr, arr.length - k, arr.length)).boxed().collect(Collectors.toList());
        }
        int loc = search(arr, x);
        int l = loc, r = loc;
        while (r - l < k - 1) {
            if (l == 0) {
                r = l + k - 1;
                break;
            }
            if (r == arr.length - 1) {
                l = arr.length - k;
                r = arr.length - 1;
                break;
            }
            if (x - arr[l - 1] <= arr[r + 1] - x) {
                l--;
            } else {
                r++;
            }
        }
        return Arrays.stream(Arrays.copyOfRange(arr, l, r + 1)).boxed().collect(Collectors.toList());
    }

    private int search(int[] arr, int x) {
        int l = 0;
        int r = arr.length - 1;
        while(l < r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            if (arr[mid] < x) {
                l = mid;
            }
            if (arr[mid] > x) {
                r = mid;
            }
            if (l + 1 == r) {
                if (Math.abs(arr[l] - x) <= Math.abs(arr[r] - x)) {
                    return l;
                } else {
                    return r;
                }
            }
        }
        return -1;
    }
}
