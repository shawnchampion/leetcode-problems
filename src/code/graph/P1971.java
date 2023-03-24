package code.graph;

import java.util.*;

public class P1971 {
    private Map<Integer, Set<Integer>> map = new HashMap<>();
    private Set<Integer> path = new HashSet<>();
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        for (int[] edge: edges) {
            add(edge[0], edge[1]);
            add(edge[1], edge[0]);
        }
        return dfs(source, destination);
    }

    private void add(int key, int value) {
        Set<Integer> linkedNodes = map.getOrDefault(key, new HashSet<>());
        linkedNodes.add(value);
        map.put(key, linkedNodes);
    }

    private boolean dfs(int node, int dest) {
        if (path.contains(node)) {
            return false;
        }
        if (node == dest) {
            return true;
        }
        path.add(node);
        for (Integer linkedNode: map.get(node)) {
            if (dfs(linkedNode, dest)) {
                return true;
            }
        }
        return false;
    }
}
