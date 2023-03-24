package code.y2022.m03;

import java.util.ArrayList;
import java.util.List;

public class D11_P2049 {
    private ArrayList<Integer>[] children;
    private int size;
    private long maxScore = 0;
    private int result;

    public int countHighestScoreNodes(int[] parents) {
        size = parents.length;
        children = new ArrayList[size];
        for (int i = 1; i < parents.length; i++) {
            if (children[parents[i]] == null) {
                children[parents[i]] = new ArrayList<>(2);
            }
            children[parents[i]].add(i);
        }
        count(0);
        return result;
    }

    private int count(int root) {
        int sum = 1;
        long score = 1;
        if (children[root] != null) {
            for (Integer child : children[root]) {
                int childCount = count(child);
                sum += childCount;
                score *= childCount;
            }
        }
        if (root != 0) {
            score *= size - sum;
        }
        if (score > maxScore) {
            maxScore = score;
            result = 1;
        } else if (score == maxScore) {
            result++;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] parents = new int[]{-1,2,0,2,0};
        new D11_P2049().countHighestScoreNodes(parents);
    }
}