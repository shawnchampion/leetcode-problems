package code.history;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class P575 {
    public static void main(String[] args) {
        System.out.println(distributeCandies(new int[]{1,1,2,3}));
    }

    public static int distributeCandies(int[] candyType) {
        Set<Integer> set = Arrays.stream(candyType).boxed().collect(Collectors.toSet());
        if (set.size() >= (candyType.length/2)) {
            return candyType.length/2;
        }
        return set.size();
    }
}
