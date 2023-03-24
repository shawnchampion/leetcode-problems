package code.y2023.m03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class D15P1615 {
    public int maximalNetworkRank(int n, int[][] roads) {
        int[][] connect = new int[n][n];
        int[] degree = new int[n];
        for (int[] road : roads) {
            connect[road[0]][road[1]] = connect[road[1]][road[0]] = 1;
            degree[road[0]]++;
            degree[road[1]]++;
        }
        int first = -1, second = -2;
        List<Integer> firstArr = new ArrayList<>();
        List<Integer> secondArr = new ArrayList<>();
        for (int i = 0; i < degree.length; i++) {
            if (degree[i] > first) {
                second = first;
                secondArr = new ArrayList<>(firstArr);
                first = degree[i];
                firstArr.clear();
                firstArr.add(i);
            } else if (degree[i] == first) {
                firstArr.add(i);
            } else if (degree[i] > second) {
                second = degree[i];
                secondArr.clear();
                secondArr.add(i);
            } else if (degree[i] == second) {
                secondArr.add(i);
            }
        }
        if (firstArr.size() == 1) {
            for (int i : secondArr) {
                if (connect[firstArr.get(0)][i] == 0) {
                    return first + second;
                }
            }
            return first + second - 1;
        }
        if (firstArr.size() * (firstArr.size() - 1) / 2 > roads.length) {
            return 2 * first;
        }
        for (int i = 0; i < firstArr.size(); i++) {
            for (int j = i + 1; j < firstArr.size(); j++) {
                if (connect[firstArr.get(i)][firstArr.get(j)] == 0) {
                    return 2 * first;
                }
            }
        }
        return 2 * first - 1;
    }
}
